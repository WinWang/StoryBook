package com.winwang.storybooks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.winwang.storybooks.R;

/**
 * 无任何控制ui的播放
 */

public class EmptyControlVideo extends StandardGSYVideoPlayer {

    ImageView cover;
    FrameLayout container;
    private boolean isFull = false;

    public EmptyControlVideo(Context context, Boolean fullFlag) {
        super(context, fullFlag);
    }

    public EmptyControlVideo(Context context) {
        super(context);
    }

    public EmptyControlVideo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getLayoutId() {
        return R.layout.empty_control_video;
    }


    @Override
    protected void init(Context context) {
        super.init(context);
        cover = (ImageView) findViewById(R.id.iv_cover_video);
        container = (FrameLayout) findViewById(R.id.surface_container);

    }

    @Override
    protected void touchSurfaceMoveFullLogic(float absDeltaX, float absDeltaY) {
        super.touchSurfaceMoveFullLogic(absDeltaX, absDeltaY);
        //不给触摸快进，如果需要，屏蔽下方代码即可
//        mChangePosition = false;

        //不给触摸音量，如果需要，屏蔽下方代码即可
//        mChangeVolume = false;

        //不给触摸亮度，如果需要，屏蔽下方代码即可
//        mBrightness = false;
    }

    @Override
    protected void touchDoubleUp() {
//        super.touchDoubleUp();
        //不需要双击暂停
    }


    public void loadCoverImage(String url) {
        Glide.with(getContext().getApplicationContext())
                .load(url)
                .into(cover);
    }

    public void setOnClick(boolean isFull) {
        this.isFull = isFull;
//        container.setOnClickListener(v -> {
//            startWindowFullscreen(getContext(), false, false);
//        });
    }

//    @Override
//    public void onClick(View v) {
//        super.onClick(v);
//        backFromFull(getContext());
//    }


    @Override
    protected void onClickUiToggle() {
//        if (isFull) {
//            backFromFull(getContext());
//        } else {
//            startWindowFullscreen(getContext(), false, false);
//        }
    }
}
