package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;

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

import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.adapter.MusicHomeAdapter;
import com.winwang.storybooks.entity.MusicHomeBean;
import com.winwang.storybooks.mvp.contract.MusicHomeContract;

import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/27/2019 16:27
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class MusicHomePresenter extends BasePresenter<MusicHomeContract.Model, MusicHomeContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    LinearLayoutManager mLinearLayoutManager;
    @Inject
    List<MusicHomeBean.ListBean> dataList;

    @Inject
    MusicHomeAdapter mHomeAdapter;


    @Inject
    public MusicHomePresenter(MusicHomeContract.Model model, MusicHomeContract.View rootView) {
        super(model, rootView);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        String bodys = "{\"version\":\"1.2.3.1\",\"merchantid\":\"10000\",\"command\":\"1024\",\"clienttype\":\"3\",\"clientversion\":\"1.2.3.1\",\"IMEI\":\"863254030269509\",\"UserID\":\"225903\",\"advsource\":\"Xiaomi\",\"md\":\"e8ad383a3c4e41a7f2bd0b4690b7f059\"}";
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), bodys);
        requestMusicHome(requestBody);
    }

    private void requestMusicHome(RequestBody requestBody) {
        mModel.getMusicHome(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<MusicHomeBean>(mErrorHandler) {
                    @Override
                    public void onNext(MusicHomeBean musicHomeBean) {
                        String resultcode = musicHomeBean.getResultcode();
                        if (TextUtils.equals(resultcode, "0")) {
                            List<MusicHomeBean.ListBean> list = musicHomeBean.getList();
                            dataList.addAll(list);
                            mHomeAdapter.notifyDataSetChanged();
                            mRootView.onSuccess();
                        } else {
                            mRootView.onFail();
                        }
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
