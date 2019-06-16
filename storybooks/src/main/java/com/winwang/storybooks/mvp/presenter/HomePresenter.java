package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.MainThread;

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
import javax.inject.Named;

import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.adapter.HomeStoryAdapter;
import com.winwang.storybooks.entity.HomeListBean;
import com.winwang.storybooks.entity.HomeReqBean;
import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.mvp.contract.HomeContract;
import com.winwang.storybooks.utils.FileUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/04/2019 18:35
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class HomePresenter extends BasePresenter<HomeContract.Model, HomeContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;
    @Inject
    Gson mGson;
    @Inject
    List<StoryListBean.S1005Bean.Classlist1Bean> dataList;
    @Inject
    HomeStoryAdapter adapter;

    private List<StoryListBean.S1005Bean.Classlist1Bean> classlist1;
    private List<StoryListBean.S1005Bean.Classlist1Bean> classlist2;


    @Inject
    public HomePresenter(HomeContract.Model model, HomeContract.View rootView) {
        super(model, rootView);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        String bodys = "{\"version\":\"1.2.3.0\",\"merchantid\":\"10000\",\"command\":\"1269\",\"clienttype\":\"3\",\"clientversion\":\"1.2.3.0\",\"IMEI\":\"864329033907351\",\"UserID\":\"225903\",\"advsource\":\"Oppo\",\"bdate\":\"\",\"md\":\"fa974d3ba8b798b9119ea837b536f744\"}";
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), bodys);
        requestStory(requestBody);
    }

    /**
     * @param bean 已被废弃，测试使用
     */
    @Deprecated
    public void requestStoryList(HomeReqBean bean) {
        String json = FileUtils.getJson(mApplication, "storylist.json");
        StoryListBean storyListBean = mGson.fromJson(json, StoryListBean.class);
        StoryListBean.S1005Bean s1005 = storyListBean.getS1005(); //故事
        //故事
        classlist1 = s1005.getClasslist1();
        //音乐
        classlist2 = s1005.getClasslist2();
        dataList.clear();
        dataList.addAll(classlist1);
        adapter.notifyDataSetChanged();

    }

    public void requestStory(RequestBody body) {
        mModel.getStoryList1(body)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<StoryListBean>(mErrorHandler) {
                    @Override
                    public void onNext(StoryListBean homeListBean) {
                        dataList.clear();
                        classlist1 = homeListBean.getS1005().getClasslist1();
                        classlist2 = homeListBean.getS1005().getClasslist2();
                        dataList.addAll(classlist1);
                        adapter.notifyDataSetChanged();
                        mRootView.onSuccess();
                    }

                    @Override
                    public void onError(Throwable t) {
                        super.onError(t);
                        mRootView.onFail();
                    }
                });
    }


    public void changeList(boolean isStory) {
        dataList.clear();
        if (isStory) {
            if (classlist2 != null) {
                dataList.addAll(classlist2);
            }
        } else {
            if (classlist1 != null) {
                dataList.addAll(classlist1);
            }
        }
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        adapter = null;
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
