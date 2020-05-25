package com.winwang.storybooks.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.winwang.storybooks.R;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerMusicDetailComponent;
import com.winwang.storybooks.mvp.contract.MusicDetailContract;
import com.winwang.storybooks.mvp.presenter.MusicDetailPresenter;
import com.winwang.storybooks.utils.ExoMediaPlayer;

import butterknife.BindView;
import butterknife.OnClick;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/28/2019 17:22
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */


@Route(path = RouterUrl.AUDIO_DETAIL_URL)
public class MusicDetailActivity extends BasesActivity<MusicDetailPresenter> implements MusicDetailContract.View, SeekBar.OnSeekBarChangeListener {
    @Autowired(name = "audioId")
    String audioId;
    @Autowired(name = "title")
    String title;

    @BindView(R.id.qm_topbar)
    QMUITopBar qmTopbar;
    @BindView(R.id.iv_radio_cover)
    ImageView ivRadioCover;
    @BindView(R.id.fl_radio_animate)
    FrameLayout flRadioAnimate;
    @BindView(R.id.iv_radio_mask)
    ImageView ivRadioMask;
    @BindView(R.id.iv_video_play)
    ImageView ivVideoPlay;
    @BindView(R.id.seek_progress)
    SeekBar seekProgress;
    @BindView(R.id.iv_video_voice)
    ImageView ivVideoVoice;
    private ExoMediaPlayer mExoMediaPlayer;
    private boolean isPlaying = false;
    private boolean hasInit = false;
    private Animation mAnimation;
    private boolean hasTouchSeek = false;
    private boolean hasComplete = false;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMusicDetailComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_music_detail; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        setTitle(title);
        mPresenter.getAudioDetail(audioId);
        seekProgress.setOnSeekBarChangeListener(this);
    }

    @Override
    public void loadNet() {

    }

    @Override
    public boolean registerArouter() {
        return true;
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
    public void setMediaUrl(String url) {
        mExoMediaPlayer = new ExoMediaPlayer(this);
        mExoMediaPlayer.playSound(url, new ExoMediaPlayer.ExoOnCompleterLister() {
            @Override
            public void onComplete() {
                hasComplete = true;
                isPlaying = false;
                ivVideoPlay.setImageResource(R.drawable.play_play);
                mPresenter.stopInterval();
                seekProgress.setProgress(0);
                if (mAnimation != null) {
                    mAnimation.cancel();
                }
                ivRadioCover.setImageResource(R.drawable.radio_cd_shibai);
                hasInit = false;
                System.out.println(">>>>>>>>>Complete");
            }

            @Override
            public void onLoading() {
                hasComplete = false;
                ivVideoPlay.setImageResource(R.drawable.play_suspend);
                System.out.println(">>>>>>>>>loading");
            }


            @Override
            public void onReady() {
                System.out.println(">>>>>>>>>Ready");
                if (!hasInit) {
                    ivRadioMask.setVisibility(View.VISIBLE);
                    ivRadioCover.setImageResource(R.drawable.radio_cd_fengmian);
                    mAnimation = AnimationUtils.loadAnimation(mContext, R.anim.civ_rotate_animate);
                    flRadioAnimate.startAnimation(mAnimation);
                    long duration = mExoMediaPlayer.getDuration();
                    seekProgress.setMax((int) duration);
                    isPlaying = true;
                    mPresenter.setTimeUpdate();
                }
                hasInit = true;

            }
        });
    }

    @Override
    public void updateTime() {
        if (!hasTouchSeek) {
            long currentPos = mExoMediaPlayer.getCurrentPos();
            seekProgress.setProgress((int) currentPos);
        }
    }

    @Override
    protected void onDestroy() {
        mExoMediaPlayer.release();
        mExoMediaPlayer = null;
        super.onDestroy();
    }


    @OnClick({R.id.iv_video_play, R.id.iv_video_voice})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_video_play:
                if (isPlaying) {
                    ivVideoPlay.setImageResource(R.drawable.play_play);
                    mPresenter.stopInterval();
                    mExoMediaPlayer.pause();
                } else {
                    if (hasComplete) {
                        mExoMediaPlayer.restart();
                    } else {
                        mExoMediaPlayer.play();
                        mPresenter.setTimeUpdate();
                        ivVideoPlay.setImageResource(R.drawable.play_suspend);
                    }
                }
                isPlaying = !isPlaying;
                break;
            case R.id.iv_video_voice:

                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        System.out.println(">>>>>>>>>>>Progress");
//        if (isPlaying) {
//            mExoMediaPlayer.setCurrentPos(progress);
//        }
}

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        System.out.println("startTrack>>>>>>");
        hasTouchSeek = true;
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        System.out.println("stopTrack>>>>>>");
        hasTouchSeek = false;
        if (isPlaying) {
            mExoMediaPlayer.setCurrentPos(seekBar.getProgress());
        }
    }
}
