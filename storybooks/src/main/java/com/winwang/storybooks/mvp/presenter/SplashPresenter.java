package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.v4.app.Fragment;
import android.support.v4.app.SupportActivity;

import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Function;
import io.reactivex.subscribers.ResourceSubscriber;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

import javax.inject.Inject;

import com.jess.arms.utils.PermissionUtil;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.mvp.contract.SplashContract;

import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/04/2019 18:39
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class SplashPresenter extends BasePresenter<SplashContract.Model, SplashContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public SplashPresenter(SplashContract.Model model, SplashContract.View rootView) {
        super(model, rootView);
    }


    /**
     * 目的是为了方便与ac的声明周期保持一致，在合适的实际调用，省去外部调用的流程
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCrate() {
        startJump();
    }

    public void startJump() {
        Flowable.interval(0, 1, TimeUnit.SECONDS)
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView)) //在声明周期的完成以后销毁
                .subscribeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(AndroidSchedulers.mainThread())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Function<Long, Long>() {

                    @Override
                    public Long apply(Long aLong) throws Exception {
                        return 4 - aLong;
                    }
                }).subscribe(new ResourceSubscriber<Long>() {
            @Override
            public void onNext(Long aLong) {
//                tvSplashSecond.setText(aLong - 1 + "s");
                System.out.println("我还在执行>>>>" + aLong);
                mRootView.setSeconds(aLong);
                if (aLong == 1) {
                    PermissionUtil.externalStorage(new PermissionUtil.RequestPermission() {
                        @Override
                        public void onRequestPermissionSuccess() {
                            mRootView.jumpCallBack();
                        }

                        @Override
                        public void onRequestPermissionFailure(List<String> permissions) {

                        }

                        @Override
                        public void onRequestPermissionFailureWithAskNeverAgain(List<String> permissions) {

                        }
                    }, mRootView.getRxPermissions(), mErrorHandler);

                }

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
