package com.winwang.storybooks.http;

import com.winwang.storybooks.entity.AudioDetailBean;
import com.winwang.storybooks.entity.MusicHomeBean;
import com.winwang.storybooks.entity.MusicListBean;
import com.winwang.storybooks.entity.StoryInListBean;
import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.entity.VideoBean;
import com.winwang.storybooks.entity.VideoDetailBean;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;

/**
 * Created by WinWang on 2019/6/5
 * Description->
 */
public interface ApiService {

    /**
     * 获取首页故事列表
     *
     * @param body
     * @return
     */
//    @Headers({"Content-Type: application/json", "Accept: application/json"})
    @POST("/")
    Observable<StoryListBean> getStoryList1(@Body RequestBody body);


    /**
     * 获取视频详情
     *
     * @param body
     * @return
     */
    @POST("/")
    Observable<VideoDetailBean> getVideoDetail(@Body RequestBody body);


    @GET
    Observable<VideoBean> getVideoUrl(@Url String url);

    /**
     * 获取听音乐分类
     *
     * @param body
     * @return
     */
    @POST("/")
    Observable<MusicHomeBean> getMusicHome(@Body RequestBody body);

    /**
     * 获取分类音乐列表数据
     *
     * @param body
     * @return
     */
    @POST("/")
    Observable<MusicListBean> getMusicList(@Body RequestBody body);


    /**
     * 获取音频详情
     *
     * @param body
     * @return
     */
    @POST("/")
    Observable<AudioDetailBean> getAudioDetail(@Body RequestBody body);


    /**
     * 获取故事列表(里面的)
     *
     * @param body
     * @return
     */
    @POST("/")
    Observable<StoryInListBean> getInStoryList(@Body RequestBody body);

}
