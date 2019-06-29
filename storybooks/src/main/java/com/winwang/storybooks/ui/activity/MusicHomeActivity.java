package com.winwang.storybooks.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.MusicHomeAdapter;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerMusicHomeComponent;
import com.winwang.storybooks.entity.MusicHomeBean;
import com.winwang.storybooks.mvp.contract.MusicHomeContract;
import com.winwang.storybooks.mvp.presenter.MusicHomePresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/27/2019 16:27
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Route(path = RouterUrl.MUSIC_HOME)
public class MusicHomeActivity extends BasesActivity<MusicHomePresenter> implements MusicHomeContract.View {

    @BindView(R.id.qm_topbar)
    QMUITopBar qmTopbar;
    @BindView(R.id.rv_music_home)
    RecyclerView rvMusicHome;

    @Inject
    MusicHomeAdapter mHomeAdapter;
    @Inject
    LinearLayoutManager mLinearLayoutManager;
    @Inject
    List<MusicHomeBean.ListBean> dataList;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMusicHomeComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_music_home; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        setTitle("听听");
        rvMusicHome.setLayoutManager(mLinearLayoutManager);
        rvMusicHome.setAdapter(mHomeAdapter);
        mHomeAdapter.setOnItemClickListener(((adapter, view, position) -> {
            String id = dataList.get(position).getID();
            String name = dataList.get(position).getName();
            ARouter.getInstance().build(RouterUrl.MUSIC_LIST)
                    .withString("queryId", id)
                    .withString("command", "1280")
                    .withString("name", name)
                    .navigation();
        }));
    }

    @Override
    public void loadNet() {
        mPresenter.onCreate();
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
}
