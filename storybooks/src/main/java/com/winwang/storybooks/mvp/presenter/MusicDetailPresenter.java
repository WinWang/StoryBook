package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.ResourceSubscriber;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import javax.inject.Inject;

import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.entity.AudioDetailBean;
import com.winwang.storybooks.mvp.contract.MusicDetailContract;

import java.util.concurrent.TimeUnit;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/28/2019 17:22
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class MusicDetailPresenter extends BasePresenter<MusicDetailContract.Model, MusicDetailContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public MusicDetailPresenter(MusicDetailContract.Model model, MusicDetailContract.View rootView) {
        super(model, rootView);
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {

    }


    public void getAudioDetail(String audioId) {
        JSONObject json = new JSONObject();
        json.put("version", "1.2.3.0");
        json.put("merchantid", "10000");
        json.put("command", "1011");
        json.put("clienttype", "3");
        json.put("clientversion", "1.2.3.0");
        json.put("IMEI", "864329033907351");
        json.put("UserID", "225903");
        json.put("advsource", "Oppo");
        json.put("qingxidu", "1");
        json.put("videoid", audioId);
        String sign = EncryptUtils.encryptMD5ToString("1.2.3.010000101131.2.3.0864329033907351225903Oppo" + audioId + "1" + AppConfig.MD5_KEY).toLowerCase();
        json.put("md", sign);
        String jsonString = json.toJSONString();
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), jsonString);
        mModel.getAudioDetail(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<AudioDetailBean>(mErrorHandler) {
                    @Override
                    public void onNext(AudioDetailBean audioDetailBean) {
                        if (TextUtils.equals(audioDetailBean.getResultcode(), "0")) {
                            mRootView.onSuccess();
                            mRootView.setMediaUrl(audioDetailBean.getVideo().getMediaUrl());
                        } else {
                            mRootView.onFail();
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                        mRootView.onFail();
                    }
                });
    }


    public void setTimeUpdate() {
        Flowable.interval(0, 700, TimeUnit.MILLISECONDS)
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView)) //在声明周期的完成以后销毁
                .subscribeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new ResourceSubscriber<Long>() {
                    @Override
                    public void onNext(Long aLong) {
                        mRootView.updateTime();
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
