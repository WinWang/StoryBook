package com.winwang.storybooks.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.shuyu.gsyvideoplayer.GSYVideoManager;
import com.shuyu.gsyvideoplayer.video.StandardGSYVideoPlayer;
import com.winwang.storybooks.R;
import com.winwang.storybooks.interfaces.PlayCompleteListener;
import com.winwang.storybooks.ui.activity.VideoDetailActivity;

/**
 * 无任何控制ui的播放
 */

public class EmptyControlVideo extends StandardGSYVideoPlayer {

    ImageView cover;
    FrameLayout container;
    private boolean isFull = true;
    private PlayCompleteListener mCompleteListener;
    float x;
    float y;
    long timeDurationStart;
    long timeDurationEnd;
    private Context context;


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
        this.context = context;
//        container.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (isFull) {
//                    GSYVideoManager.backFromWindowFull(context);
//                } else {
//                    startWindowFullscreen(context, false, false);
//                }
//                isFull = !isFull;
//            }
//        });
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
        System.out.println(">>>>>>X" + absDeltaX + ">>>>>>>>Y" + absDeltaY);
    }

    @Override
    protected void touchDoubleUp() {
        super.touchDoubleUp();
        //不需要双击暂停
    }

    @Override
    protected void touchSurfaceDown(float x, float y) {
        super.touchSurfaceDown(x, y);
        timeDurationStart = System.currentTimeMillis();
    }

    @Override
    protected void touchSurfaceUp() {
        super.touchSurfaceUp();
        if (System.currentTimeMillis() - timeDurationStart < 300) {
            if ( GSYVideoManager.isFullState((VideoDetailActivity)context)) {
                GSYVideoManager.backFromWindowFull(context);
            } else {
                startWindowFullscreen(context, false, false);
            }
        }
    }

    public void loadCoverImage(String url) {
        Glide.with(context)
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


    public void setOnCompleteListener(PlayCompleteListener listener) {
        this.mCompleteListener = listener;
    }


    @Override
    public void onAutoCompletion() {
        super.onAutoCompletion();
        if (mCompleteListener != null) {
            mCompleteListener.onComplete();
        }
    }

    @Override
    public void onVideoPause() {
        super.onVideoPause();
        if (mCompleteListener != null) {
            mCompleteListener.onPlayerPause();
        }
    }


    @Override
    public void onVideoResume() {
        super.onVideoResume();
        if (mCompleteListener != null) {
            mCompleteListener.onPlayerPlay();
        }
    }
}
