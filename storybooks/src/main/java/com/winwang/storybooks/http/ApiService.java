package com.winwang.storybooks.http;

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


}
