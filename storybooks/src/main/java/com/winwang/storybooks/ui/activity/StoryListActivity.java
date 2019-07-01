package com.winwang.storybooks.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.StoryListAdapter;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerStoryListComponent;
import com.winwang.storybooks.entity.StoryInListBean;
import com.winwang.storybooks.mvp.contract.StoryListContract;
import com.winwang.storybooks.mvp.presenter.StoryListPresenter;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/01/2019 18:21
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */

@Route(path = RouterUrl.STORY_LIST)
public class StoryListActivity extends BasesActivity<StoryListPresenter> implements StoryListContract.View, BaseQuickAdapter.OnItemClickListener {

    @Autowired(name = "name")
    String name;
    @Autowired(name = "queryId")
    String queryId;
    @Autowired(name = "command")
    String command;

    @BindView(R.id.qm_topbar)
    QMUITopBar qmTopbar;
    @BindView(R.id.rv_story_list)
    RecyclerView rvStoryList;

    @Inject
    StoryListAdapter mListAdapter;
    @Inject
    List<StoryInListBean.ClasslistBean> storyList;
    @Inject
    LinearLayoutManager mLinearLayoutManager;


    private int pageIndex = 1;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerStoryListComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_story_list; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }


    @Override
    public boolean registerArouter() {
        return true;
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        setTitle(name);
        rvStoryList.setLayoutManager(mLinearLayoutManager);
        rvStoryList.setAdapter(mListAdapter);
        mPresenter.queryList(pageIndex, queryId, command);
        mListAdapter.setOnItemClickListener(this);

    }

    @Override
    public void loadNet() {

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
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        String id = storyList.get(position).getID();
        String name = storyList.get(position).getName();
        ARouter.getInstance().build(RouterUrl.VIDEO_DETAIL_URL)
                .withString("videoId", id)
                .withString("name", name)
                .navigation();
    }
}
