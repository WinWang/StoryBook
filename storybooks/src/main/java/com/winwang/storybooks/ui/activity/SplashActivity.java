package com.winwang.storybooks.ui.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.LoadSir;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import com.winwang.storybooks.R;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerSplashComponent;
import com.winwang.storybooks.mvp.contract.SplashContract;
import com.winwang.storybooks.mvp.presenter.SplashPresenter;
import com.winwang.storybooks.service.PlayService;
import com.winwang.storybooks.utils.customAnnotation.RequestPermissions;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/04/2019 18:39
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
public class SplashActivity extends BasesActivity<SplashPresenter> implements SplashContract.View {

    @BindView(R.id.rbt_seconds)
    QMUIRoundButton rbtSeconds;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerSplashComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_splash; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mLoadService.showCallback(SuccessCallback.class);
        startService(new Intent(this, PlayService.class));
    }

    @Override
    public void loadNet() {

    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

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



    @RequestPermissions({Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE})
    @Override
    public void jumpCallBack() {
        ARouter.getInstance().build(RouterUrl.HOME_URL).navigation();
        killMyself();
    }

    @Override
    public void setSeconds(long second) {
        rbtSeconds.setText(second + "s");
    }

    @OnClick(R.id.rbt_seconds)
    public void onViewClicked() {
        jumpCallBack();
    }


    @Override
    public void onBackPressed() {
        stopService(new Intent(this, PlayService.class));
        super.onBackPressed();
    }
}
