package com.winwang.storybooks.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.jess.arms.base.AdapterViewPager;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.winwang.storybooks.R;
import com.winwang.storybooks.base.BasesActivity;
import com.winwang.storybooks.common.RouterUrl;
import com.winwang.storybooks.di.component.DaggerTalkComponent;
import com.winwang.storybooks.mvp.contract.TalkContract;
import com.winwang.storybooks.mvp.presenter.TalkPresenter;
import com.winwang.storybooks.ui.fragment.MyRankFragment;
import com.winwang.storybooks.ui.fragment.MyTalkFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;

import static com.jess.arms.utils.Preconditions.checkNotNull;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/02/2019 19:52
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Route(path = RouterUrl.TALK_LIST)
public class TalkActivity extends BasesActivity<TalkPresenter> implements TalkContract.View, RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener {

    @Inject
    List<Fragment> mFragmentList;
    @Inject
    AdapterViewPager mViewPagerAdapter;
    @Inject
    MyTalkFragment mMyTalkFragment;
    @Inject
    MyRankFragment mMyRankFragment;
    @BindView(R.id.qm_topbar)
    QMUITopBar qmTopbar;
    @BindView(R.id.rdb_talk)
    RadioButton rdbTalk;
    @BindView(R.id.rdb_rank)
    RadioButton rdbRank;
    @BindView(R.id.radio_group)
    RadioGroup radioGroup;
    @BindView(R.id.vp_talk_rank)
    ViewPager vpTalkRank;


    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerTalkComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .view(this)
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.activity_talk; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {
        mFragmentList.add(mMyTalkFragment);
        mFragmentList.add(mMyRankFragment);
        vpTalkRank.setAdapter(mViewPagerAdapter);
        radioGroup.setOnCheckedChangeListener(this);
        vpTalkRank.addOnPageChangeListener(this);
        onSuccess();
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
    public FragmentActivity getActivity() {
        return this;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rdb_talk:
                vpTalkRank.setCurrentItem(0);
                break;

            case R.id.rdb_rank:
                vpTalkRank.setCurrentItem(1);
                break;
        }
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        switch (i) {
            case 0:
                rdbTalk.setChecked(true);
                break;

            case 1:
                rdbRank.setChecked(true);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
