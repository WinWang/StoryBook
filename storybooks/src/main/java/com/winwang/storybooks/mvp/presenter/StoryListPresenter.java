package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
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

import com.jess.arms.utils.LogUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.adapter.StoryCatAdapter;
import com.winwang.storybooks.adapter.StoryListAdapter;
import com.winwang.storybooks.entity.MusicListBean;
import com.winwang.storybooks.entity.StoryInListBean;
import com.winwang.storybooks.mvp.contract.StoryListContract;

import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/01/2019 18:21
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
public class StoryListPresenter extends BasePresenter<StoryListContract.Model, StoryListContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    List<StoryInListBean.ClasslistBean> dataList;
    @Inject
    StoryListAdapter mListAdapter;


    @Inject
    List<StoryInListBean.CategoryListBean> catList;
    @Inject
    StoryCatAdapter mCatAdapter;


    @Inject
    public StoryListPresenter(StoryListContract.Model model, StoryListContract.View rootView) {
        super(model, rootView);
    }

    public void queryList(int page, String type, String commond) {
        JSONObject json = new JSONObject();
        json.put("version", "1.2.3.1");
        json.put("merchantid", "10000");
        json.put("command", commond);
        json.put("clienttype", "3");
        json.put("clientversion", "1.2.3.1");
        json.put("IMEI", "864329033907351");
        json.put("UserID", "225903");
        json.put("advsource", "Oppo");
        json.put("pagesize", "12");
        json.put("pageno", page);
        json.put("Mediatype", "0");
        json.put("type", type);
        json.put("bdate", "");
        json.put("sortType", "");
        json.put("NeedClass", "0");
        json.put("sortBy", "desc");
        String letters = "1.2.3.110000" + commond + "31.2.3.1864329033907351225903Oppo12" + page + "0" + type + "desc0" + AppConfig.MD5_KEY;
        LogUtils.debugInfo(letters);
        String sign = EncryptUtils.encryptMD5ToString(letters).toLowerCase();
        json.put("md", sign);
        String jsonString = json.toJSONString();
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), jsonString);
        mModel.getStoryListIn(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<StoryInListBean>(mErrorHandler) {
                    @Override
                    public void onNext(StoryInListBean musicListBean) {
                        if (TextUtils.equals(musicListBean.getResultcode(), "0")) {
                            if (page == 1) {
                                dataList.clear();
                            }
                            dataList.addAll(musicListBean.getClasslist());
                            List<StoryInListBean.CategoryListBean> categoryList = musicListBean.getCategoryList();
                            if (categoryList != null && categoryList.size() > 0) {
                                catList.addAll(musicListBean.getCategoryList());
                            }
                            mCatAdapter.notifyDataSetChanged();
                            mListAdapter.notifyDataSetChanged();
                            mRootView.onSuccess();
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


    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
    }
}
