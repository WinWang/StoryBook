package com.winwang.storybooks.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.winwang.storybooks.R;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.di.component.DaggerVideoDetailComponent;
import com.winwang.storybooks.mvp.contract.VideoDetailContract;
import com.winwang.storybooks.mvp.presenter.VideoDetailPresenter;
import com.winwang.storybooks.widget.EmptyControlVideo;

import butterknife.BindView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


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
public class VideoDetailActivity extends BasesActivity<VideoDetailPresenter> implements VideoDetailContract.View, View.OnClickListener {

    String videoId;
    @BindView(R.id.player_video)
    EmptyControlVideo playerVideo;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerVideoDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_video_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Intent intent = getIntent();
        videoId = intent.getStringExtra("videoId");
        mPresenter.getVideoDetail();
        playerVideo.setOnClickListener(this);
    }

    @Override
    public void loadNet() {
        mPresenter.getVideoDetail();
    }

    @Override
    public void onSuccess() {
        showSuccess();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void onFail() {
        showFail();
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @Override
    public String getVideoId() {
        return videoId;
    }

    @Override
    public void setVideoData(String url) {
        playerVideo.setOnClick(false);
        playerVideo.setUp(url, true, "");
        playerVideo.startPlayLogic();
//        playerVideo.startWindowFullscreen(this, true, true);
    }

    @Override
    public void setVideoCover(String cover) {
        playerVideo.loadCoverImage(cover);
    }


    @Override
    protected void onDestroy() {
        getCurPlay().release();
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        playerVideo.startWindowFullscreen(this, false, false);
    }

    private GSYVideoPlayer getCurPlay() {
        if (playerVideo.getFullWindowPlayer() != null) {
            return playerVideo.getFullWindowPlayer();
        }
        return playerVideo;
    }

}
