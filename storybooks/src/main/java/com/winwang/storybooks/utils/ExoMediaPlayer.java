package com.winwang.storybooks.utils;

import android.content.Context;
import android.net.Uri;

import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.RenderersFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

public class ExoMediaPlayer {

    public SimpleExoPlayer mPlayer;
    private MediaSource firstSource;
    private DefaultDataSourceFactory dataSourceFactory;
    private Context mContext;

    public ExoMediaPlayer(Context context) {
        mContext = context;
    }


    public void playSound(String path, ExoOnCompleterLister lister) {
        RenderersFactory renderersFactory = new DefaultRenderersFactory(mContext);
        DefaultTrackSelector trackSelector = new DefaultTrackSelector();
        LoadControl loadControl = new DefaultLoadControl();
        mPlayer = ExoPlayerFactory.newSimpleInstance(mContext, renderersFactory, trackSelector, loadControl);
        Uri mp4Uri = Uri.parse(path);
        dataSourceFactory = new DefaultDataSourceFactory(
                mContext, Util.getUserAgent(mContext, "storybooks"));
        firstSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(mp4Uri);
        mPlayer.prepare(firstSource);
        mPlayer.addListener(new Listener(lister));
        mPlayer.setPlayWhenReady(true);
    }


    public void playSoundLocal(int music, ExoOnCompleterLister lister, boolean isRepeat) {
        RenderersFactory renderersFactory = new DefaultRenderersFactory(mContext);
        DefaultTrackSelector trackSelector = new DefaultTrackSelector();
        LoadControl loadControl = new DefaultLoadControl();
        mPlayer = ExoPlayerFactory.newSimpleInstance(mContext, renderersFactory, trackSelector, loadControl);
        if (isRepeat) {
            mPlayer.setRepeatMode(Player.REPEAT_MODE_ALL);
        }
        Uri mp4Uri = Uri.parse("rawresource:///" + music);
        dataSourceFactory = new DefaultDataSourceFactory(
                mContext, Util.getUserAgent(mContext, "storybooks"));
        firstSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(mp4Uri);
        mPlayer.prepare(firstSource);
        mPlayer.addListener(new Listener(lister));
        mPlayer.setPlayWhenReady(true);
    }


    public void playSoundSingle(int music) {
        RenderersFactory renderersFactory = new DefaultRenderersFactory(mContext);
        DefaultTrackSelector trackSelector = new DefaultTrackSelector();
        LoadControl loadControl = new DefaultLoadControl();
        mPlayer = ExoPlayerFactory.newSimpleInstance(mContext, renderersFactory, trackSelector, loadControl);
        Uri mp4Uri = Uri.parse("rawresource:///" + music);
        dataSourceFactory = new DefaultDataSourceFactory(
                mContext, Util.getUserAgent(mContext, "storybooks"));
        firstSource = new ExtractorMediaSource.Factory(dataSourceFactory).createMediaSource(mp4Uri);
        mPlayer.prepare(firstSource);
        mPlayer.setPlayWhenReady(true);
    }


    /**
     * 释放资源
     */
    public void release() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    /**
     * 暂停
     */
    public void pause() {
        if (mPlayer != null) {
            mPlayer.setPlayWhenReady(false);
        }
    }

    /**
     * 暂停
     */
    public void play() {
        if (mPlayer != null) {
            mPlayer.setPlayWhenReady(true);
        }
    }


    public void setVolume(float volume) {
        if (mPlayer != null) {
            mPlayer.setVolume(volume);
        }
    }


    /**
     * 回调监听
     */
    static class Listener extends Player.DefaultEventListener {
        ExoOnCompleterLister lister;

        public Listener(ExoOnCompleterLister lister) {
            this.lister = lister;
        }

        @Override
        public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
            if (playbackState == 4) {
                lister.onComplete();
            }
            super.onPlayerStateChanged(playWhenReady, playbackState);
        }
    }

    /**
     * 回调接口
     */
    public interface ExoOnCompleterLister {
        void onComplete();
    }


}
