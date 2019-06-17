package com.winwang.storybooks.mvp.model;

import android.app.Application;

import com.google.gson.Gson;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import com.jess.arms.di.scope.ActivityScope;

import javax.inject.Inject;

import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.entity.VideoBean;
import com.winwang.storybooks.entity.VideoDetailBean;
import com.winwang.storybooks.http.ApiService;
import com.winwang.storybooks.http.CacheApi;
import com.winwang.storybooks.mvp.contract.VideoDetailContract;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import okhttp3.RequestBody;


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
public class VideoDetailModel extends BaseModel implements VideoDetailContract.Model {
    @Inject
    Gson mGson;
    @Inject
    Application mApplication;

    @Inject
    public VideoDetailModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mGson = null;
        this.mApplication = null;
    }

    @Override
    public Observable<VideoDetailBean> getVideoDetail(RequestBody body, String url) {
        Observable<VideoDetailBean> observable = mRepositoryManager.obtainCacheService(CacheApi.class)
                .getVideoDetail(mRepositoryManager
                        .obtainRetrofitService(ApiService.class)
                        .getVideoDetail(body), new DynamicKey(url), new EvictDynamicKey(false));
        return observable;
    }

    @Override
    public Observable<VideoBean> getVideoUrl(String url) {
//        Observable<VideoBean> observable = mRepositoryManager.obtainCacheService(CacheApi.class)
//                .getVideoDetailUrl(mRepositoryManager
//                        .obtainRetrofitService(ApiService.class)
//                        .getVideoUrl(url), new DynamicKey(url), new EvictDynamicKey(false));
        return mRepositoryManager
                .obtainRetrofitService(ApiService.class)
                .getVideoUrl(url);
    }
}