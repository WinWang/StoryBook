package com.winwang.storybooks.service;

import android.text.TextUtils;

import com.jess.arms.base.BaseService;
import com.winwang.storybooks.R;
import com.winwang.storybooks.event.MusicEvent;
import com.winwang.storybooks.utils.ExoMediaPlayer;

import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

/**
 * Created by WinWang on 2019/6/18
 * Description->
 */
public class PlayService extends BaseService {

    private ExoMediaPlayer mExoMediaPlayer;

    @Override
    public void init() {
        mExoMediaPlayer = new ExoMediaPlayer(this);
        mExoMediaPlayer.playSoundLocal(R.raw.beijing, new ExoMediaPlayer.ExoOnCompleterLister() {
            @Override
            public void onComplete() {

            }
        }, true);
    }


    @Override
    public boolean useEventBus() {
        return true;
    }


    @Override
    public void onDestroy() {
        mExoMediaPlayer.release();//释放资源
        super.onDestroy();
    }

    @Subscribe(threadMode = ThreadMode.POSTING)
    public void pauseMusic(MusicEvent event) {
        if (event != null && TextUtils.equals("homePause", event.eventName)) {
            mExoMediaPlayer.pause();
        } else if (event != null && TextUtils.equals("homePlay", event.eventName)) {
            mExoMediaPlayer.play();
        }
    }
}
