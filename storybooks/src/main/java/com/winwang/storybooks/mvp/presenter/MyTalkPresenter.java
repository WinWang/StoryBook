package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import javax.inject.Inject;

import com.jess.arms.utils.LogUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.entity.TalkBean;
import com.winwang.storybooks.mvp.contract.MyTalkContract;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 14:31
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class MyTalkPresenter extends BasePresenter<MyTalkContract.Model, MyTalkContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    public MyTalkPresenter(MyTalkContract.Model model, MyTalkContract.View rootView) {
        super(model, rootView);
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
