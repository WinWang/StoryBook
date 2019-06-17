package com.winwang.storybooks.http;


import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.entity.VideoBean;
import com.winwang.storybooks.entity.VideoDetailBean;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictDynamicKey;
import io.rx_cache2.LifeCache;

/**
 * Created by WinWang on 2019/6/14
 * Description->
 */
public interface CacheApi {
    /**
     * 首页获取故事列表
     *
     * @param story
     * @param key
     * @param key
     * @return
     */
    @LifeCache(duration = 7, timeUnit = TimeUnit.DAYS)
    Observable<StoryListBean> getStoryList(Observable<StoryListBean> story, DynamicKey key, EvictDynamicKey keyE);


    /**
     * 获取视频详情
     *
     * @param story
     * @param key
     * @param key
     * @return
     */
    @LifeCache(duration = 7, timeUnit = TimeUnit.DAYS)
    Observable<VideoDetailBean> getVideoDetail(Observable<VideoDetailBean> story, DynamicKey key, EvictDynamicKey keyE);


    /**
     * 获取视频播放链接
     *
     * @param story
     * @param key
     * @param key
     * @return
     */
    @LifeCache(duration = 7, timeUnit = TimeUnit.DAYS)
    Observable<VideoBean> getVideoDetailUrl(Observable<VideoBean> story, DynamicKey key, EvictDynamicKey keyE);


}
