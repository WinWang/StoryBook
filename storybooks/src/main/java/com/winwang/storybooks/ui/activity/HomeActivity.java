package com.winwang.storybooks.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.leochuan.CenterSnapHelper;
import com.leochuan.CircleScaleLayoutManager;
import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.HomeStoryAdapter;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerHomeComponent;
import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.event.MusicEvent;
import com.winwang.storybooks.mvp.contract.HomeContract;
import com.winwang.storybooks.mvp.presenter.HomePresenter;
import com.winwang.storybooks.service.PlayService;
import com.winwang.storybooks.utils.ExoMediaPlayer;

import org.greenrobot.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.autosize.AutoSizeCompat;
import me.jessyan.autosize.utils.AutoSizeUtils;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/04/2019 18:35
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */

@Route(path = RouterUrl.HOME_URL)
public class HomeActivity extends BasesActivity<HomePresenter> implements HomeContract.View {


    @BindView(R.id.rv_home)
    RecyclerView rvHome;
    @Inject
    CircleScaleLayoutManager layoutManager;
    @Inject
    HomeStoryAdapter adapter;

    @BindView(R.id.iv_home_listen)
    ImageView ivHomeListen;
    @BindView(R.id.iv_home_story)
    ImageView ivHomeStory;
    @BindView(R.id.iv_home_music)
    ImageView ivHomeMusic;
    @BindView(R.id.iv_home_like)
    ImageView ivHomeLike;
    @BindView(R.id.iv_home_time)
    ImageView ivHomeTime;
    @BindView(R.id.iv_home_download)
    ImageView ivHomeDownload;
    @BindView(R.id.iv_home_type_music_story)
    ImageView ivHomeTypeMusicStory;
    @BindView(R.id.iv_home_bird)
    ImageView ivHomeBird;
    @BindView(R.id.iv_girl_anim)
    ImageView ivGirlAnim;
    private boolean isStory = true;
    private boolean isGirlShow = false;

    @Inject
    List<StoryListBean.S1005Bean.Classlist1Bean> dataList;
    private ExoMediaPlayer mExoMediaPlayer;


    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerHomeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_home; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.virbrate_animate);
        ivHomeBird.startAnimation(animation);
        CenterSnapHelper centerSnapHelper = new CenterSnapHelper();
        layoutManager.setRadius(AutoSizeUtils.dp2px(this, 1800));
        layoutManager.setAngleInterval(10);
        layoutManager.setCenterScale(1.2f);
        layoutManager.setInfinite(true);
        layoutManager.setMoveSpeed(0.007f);
        ArmsUtils.configRecyclerView(rvHome, layoutManager);
        centerSnapHelper.attachToRecyclerView(rvHome);
        rvHome.setAdapter(adapter);
        ivHomeBird.setImageResource(R.drawable.fly_anim);
        AnimationDrawable ivHomeBirdDrawable = (AnimationDrawable) ivHomeBird.getDrawable();
        ivHomeBirdDrawable.start();
        initListener();


    }

    @Override
    public void loadNet() {
        mPresenter.onCreate();
    }

    private void initListener() {
        adapter.setOnItemClickListener(((adapter1, view, position) -> {
            int videoId = dataList.get(position).getVideoId();
            String name = dataList.get(position).getName();
            ARouter.getInstance().build(RouterUrl.VIDEO_DETAIL_URL)
                    .withString("videoId", videoId + "")
                    .withString("name", name)
                    .navigation();
        }));
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
    public Activity getActivity() {
        return this;
    }


    @OnClick({R.id.iv_home_listen, R.id.iv_home_story, R.id.iv_home_music,
            R.id.iv_home_like, R.id.iv_home_time,
            R.id.iv_home_download, R.id.iv_home_type_music_story,
            R.id.iv_home_bird, R.id.iv_girl_anim})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.iv_home_listen:
                ARouter.getInstance().build(RouterUrl.MUSIC_HOME)
                        .navigation();
                break;
            case R.id.iv_home_story:
                ARouter.getInstance().build(RouterUrl.STORY_LIST)
                        .withString("queryId", "1")
                        .withString("command", "1280")
                        .withString("name", "故事")
                        .navigation();
                break;
            case R.id.iv_home_music:
                break;
            case R.id.iv_home_like:
                break;
            case R.id.iv_home_time:
                break;
            case R.id.iv_home_download:
                break;
            case R.id.iv_home_type_music_story:
                changeSvM();
                AnimationDrawable drawable = (AnimationDrawable) ivHomeTypeMusicStory.getDrawable();
                drawable.start();

                break;
            case R.id.iv_home_bird:
                changeSvM();
                drawable = (AnimationDrawable) ivHomeTypeMusicStory.getDrawable();
                drawable.start();
                break;
            case R.id.iv_girl_anim:
                if (!isGirlShow) {
                    isGirlShow = true;
                    ViewCompat.animate(ivGirlAnim).setDuration(500).translationX(getResources().getDimension(R.dimen.girl_move)).setInterpolator(new AccelerateInterpolator()).start();
                    ivGirlAnim.setImageResource(R.drawable.girl_anim);
                    AnimationDrawable girlAnimDrawable = (AnimationDrawable) ivGirlAnim.getDrawable();
                    girlAnimDrawable.start();
                    setTimeOut();
                } else {
                    ARouter.getInstance().build(RouterUrl.TALK_LIST)
                            .navigation();
                }

                break;
        }
    }

    private void setTimeOut() {
        Observable.timer(5, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        addDispose(d);
                    }

                    @Override
                    public void onNext(Long aLong) {
                        ViewCompat.animate(ivGirlAnim).setDuration(500).translationX(0).setInterpolator(new AccelerateInterpolator()).start();
                        ivGirlAnim.setImageResource(R.drawable.btn_girl_woyaojiang);
                        isGirlShow = false;
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    private void changeSvM() {
        if (mExoMediaPlayer == null) {
            mExoMediaPlayer = new ExoMediaPlayer(this);
        }
        if (isStory) {
            mExoMediaPlayer.playSoundSingle(R.raw.erge);
            ivHomeTypeMusicStory.setImageResource(R.drawable.music_anim);
            mPresenter.changeList(true);
            if (dataList.size() > 0) {
                rvHome.scrollToPosition(0);
                rvHome.smoothScrollToPosition(1);
            }
        } else {
            mExoMediaPlayer.playSoundSingle(R.raw.gushi);
            ivHomeTypeMusicStory.setImageResource(R.drawable.story_anim);
            mPresenter.changeList(false);
            if (dataList.size() > 0) {
                rvHome.scrollToPosition(1);
                rvHome.smoothScrollToPosition(0);
            }
        }
        isStory = !isStory;
    }

    @Override
    protected void onDestroy() {
        unDispose();
        stopService(new Intent(this, PlayService.class));
        if (mExoMediaPlayer != null) {
            mExoMediaPlayer.release();
        }
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().post(new MusicEvent("homePause"));
    }

    @Override
    protected void onResume() {
        super.onResume();
        EventBus.getDefault().post(new MusicEvent("homePlay"));
    }

}
