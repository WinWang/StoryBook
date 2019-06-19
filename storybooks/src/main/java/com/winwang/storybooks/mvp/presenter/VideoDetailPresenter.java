package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.ObjectUtils;
import com.google.gson.Gson;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import javax.inject.Inject;

import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.entity.VideoBean;
import com.winwang.storybooks.entity.VideoDetailBean;
import com.winwang.storybooks.http.RequestParams;
import com.winwang.storybooks.mvp.contract.VideoDetailContract;

import java.util.HashMap;
import java.util.LinkedHashMap;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/13/2019 19:33
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class VideoDetailPresenter extends BasePresenter<VideoDetailContract.Model, VideoDetailContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public VideoDetailPresenter(VideoDetailContract.Model model, VideoDetailContract.View rootView) {
        super(model, rootView);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {

    }

    public void getVideoDetail() {
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
        json.put("videoid", mRootView.getVideoId());
        String sign = EncryptUtils.encryptMD5ToString("1.2.3.010000101131.2.3.0864329033907351225903Oppo" + mRootView.getVideoId() + "1" + AppConfig.MD5_KEY).toLowerCase();
        json.put("md", sign);
        String jsonString = json.toJSONString();
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), jsonString);
        mModel.getVideoDetail(requestBody, mRootView.getVideoId())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<VideoDetailBean>(mErrorHandler) {
                    @Override
                    public void onNext(VideoDetailBean videoDetailBean) {
                        if (TextUtils.equals(videoDetailBean.getResultcode(), "0")) {
                            String printscreen = videoDetailBean.getVideo().getPrintscreen();
                            mRootView.setVideoCover(printscreen);
                            mRootView.onSuccess();
                            getVideoUrl(videoDetailBean.getVideo().getMediaUrl());
                        } else {
                            mRootView.onFail();
                            ArmsUtils.snackbarText(videoDetailBean.getMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                        mRootView.onFail();
                    }
                });


    }

    /**
     * 获取播放链接
     *
     * @param url
     */
    public void getVideoUrl(String url) {
        mModel.getVideoUrl(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<VideoBean>(mErrorHandler) {
                    @Override
                    public void onNext(VideoBean videoBean) {
                        mRootView.setVideoData(videoBean.getL());
                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                        mRootView.onFail();
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
