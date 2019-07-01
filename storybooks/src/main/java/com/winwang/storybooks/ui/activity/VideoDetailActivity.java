package com.winwang.storybooks.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.jess.arms.utils.LogUtils;
import com.shuyu.gsyvideoplayer.listener.GSYVideoProgressListener;
import com.shuyu.gsyvideoplayer.video.base.GSYVideoPlayer;
import com.winwang.storybooks.R;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerVideoDetailComponent;
import com.winwang.storybooks.interfaces.PlayCompleteListener;
import com.winwang.storybooks.mvp.contract.VideoDetailContract;
import com.winwang.storybooks.mvp.presenter.VideoDetailPresenter;
import com.winwang.storybooks.widget.EmptyControlVideo;

import butterknife.BindView;
import butterknife.OnClick;

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

@Route(path = RouterUrl.VIDEO_DETAIL_URL)
public class VideoDetailActivity extends BasesActivity<VideoDetailPresenter> implements VideoDetailContract.View, GSYVideoProgressListener, SeekBar.OnSeekBarChangeListener, PlayCompleteListener {

    @BindView(R.id.player_video)
    EmptyControlVideo playerVideo;
    @BindView(R.id.iv_video_download)
    ImageView ivVideoDownload;
    @BindView(R.id.iv_video_like)
    ImageView ivVideoLike;
    @BindView(R.id.iv_video_comment)
    ImageView ivVideoComment;
    @BindView(R.id.iv_video_play)
    ImageView ivVideoPlay;
    @BindView(R.id.seek_progress)
    SeekBar seekProgress;
    @BindView(R.id.iv_video_voice)
    ImageView ivVideoVoice;
    private boolean seekTouch = false; //seekBar 触摸标记
    private boolean playTag = true;
    private boolean hasComplete = false;
    private boolean fullTag = true;
    /**
     * Arouter 获取参数
     */
    @Autowired(name = "videoId")
    String videoId;
    @Autowired(name = "name")
    String name;

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
        setTitle(name);
        seekProgress.setOnSeekBarChangeListener(this);
        playerVideo.setGSYVideoProgressListener(this);
        playerVideo.setOnCompleteListener(this);
        mPresenter.getVideoDetail();
    }

    @Override
    public void loadNet() {
        mPresenter.getVideoDetail();
    }


    @Override
    public boolean registerArouter() {
        return true;
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
        playerVideo.setUp(url, true, "");
        playerVideo.startPlayLogic();
        playerVideo.setRotateViewAuto(false);
        playerVideo.startWindowFullscreen(this, false, false);
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

    private GSYVideoPlayer getCurPlay() {
        if (playerVideo.getFullWindowPlayer() != null) {
            return playerVideo.getFullWindowPlayer();
        }
        return playerVideo;
    }

    /**
     * 动态设置进度(监听)
     *
     * @param progress
     * @param secProgress
     * @param currentPosition
     * @param duration
     */
    @Override
    public void onProgress(int progress, int secProgress, int currentPosition, int duration) {
        if (!seekTouch) {
            seekProgress.setMax(duration);
            seekProgress.setProgress(currentPosition);
        }
    }


    @OnClick({R.id.iv_video_download, R.id.iv_video_like, R.id.iv_video_comment, R.id.iv_video_play, R.id.iv_video_voice})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_video_download:
                break;
            case R.id.iv_video_like:
                break;
            case R.id.iv_video_comment:
                break;
            case R.id.iv_video_play:
                if (playTag) {
                    playerVideo.onVideoPause();
                } else {
                    if (hasComplete) {
                        playerVideo.startPlayLogic();
                        playerVideo.onVideoResume();
                        hasComplete = false;
                    } else {
                        playerVideo.onVideoResume();
                    }
                }
                break;
            case R.id.iv_video_voice:
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        seekTouch = true;
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        seekTouch = false;
        int progress = seekBar.getProgress();
        getCurPlay().seekTo(progress);
    }

    /**
     * 播放完成的回调
     */
    @Override
    public void onComplete() {
        seekProgress.setProgress(0);
        ivVideoPlay.setImageResource(R.drawable.play_play);
        hasComplete = true;
        playTag = false;
        LogUtils.debugInfo(">>>>>>播放完成");
    }

    @Override
    public void onPlayerPause() {
        ivVideoPlay.setImageResource(R.drawable.play_play);
        playTag = false;
        LogUtils.debugInfo(">>>>>>播放暂停");
    }

    @Override
    public void onPlayerPlay() {
        ivVideoPlay.setImageResource(R.drawable.play_suspend);
        playTag = true;
        LogUtils.debugInfo(">>>>>>播放开始");
    }


}
