package com.winwang.storybooks.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.MusicListAdapter;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerMusicListComponent;
import com.winwang.storybooks.entity.MusicListBean;
import com.winwang.storybooks.mvp.contract.MusicListContract;
import com.winwang.storybooks.mvp.presenter.MusicListPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/27/2019 17:02
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Route(path = RouterUrl.MUSIC_LIST)
public class MusicListActivity extends BasesActivity<MusicListPresenter> implements MusicListContract.View {

    @BindView(R.id.qm_topbar)
    QMUITopBar qmTopbar;
    @BindView(R.id.rv_music_list)
    RecyclerView rvMusicList;


    @Autowired(name = "name")
    String name;
    @Autowired(name = "queryId")
    String queryId;
    @Autowired(name = "command")
    String command;
    @Inject
    List<MusicListBean.ClasslistBean> dataList;
    @Inject
    MusicListAdapter mAdapter;
    @Inject
    LinearLayoutManager mLinearLayoutManager;

    private int pageIndex = 1;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerMusicListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_music_list; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        setTitle(name);
        rvMusicList.setLayoutManager(mLinearLayoutManager);
        rvMusicList.setAdapter(mAdapter);
        mPresenter.queryList(pageIndex, queryId, command);
        mAdapter.setOnItemClickListener(((adapter, view, position) -> {
            String id = dataList.get(position).getID();
            String name = dataList.get(position).getName();
            ARouter.getInstance().build(RouterUrl.AUDIO_DETAIL_URL)
                    .withString("audioId", id)
                    .withString("title", name)
                    .navigation();
        }));
    }

    @Override
    public void loadNet() {
        mPresenter.queryList(pageIndex, queryId, command);
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

    @Override
    public boolean registerArouter() {
        return true;
    }
}
