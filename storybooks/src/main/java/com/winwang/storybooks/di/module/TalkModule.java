package com.winwang.storybooks.di.module;

import android.support.v4.app.Fragment;

import com.jess.arms.base.AdapterViewPager;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.mvp.contract.TalkContract;
import com.winwang.storybooks.mvp.model.TalkModel;
import com.winwang.storybooks.ui.fragment.MyRankFragment;
import com.winwang.storybooks.ui.fragment.MyTalkFragment;

import java.util.ArrayList;
import java.util.List;


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
@Module
public abstract class TalkModule {

    @Binds
    abstract TalkContract.Model bindTalkModel(TalkModel model);


    @ActivityScope
    @Provides
    static List<Fragment> provideFragmentList() {
        return new ArrayList<>();
    }


    @ActivityScope
    @Provides
    static AdapterViewPager provideVpAdapter(TalkContract.View view, List<Fragment> fragmentList) {
        return new AdapterViewPager(view.getActivity().getSupportFragmentManager(), fragmentList);
    }


    @ActivityScope
    @Provides
    static MyTalkFragment provideTalkFragment() {
        return MyTalkFragment.newInstance();
    }


    @ActivityScope
    @Provides

    static MyRankFragment provideRankFragment() {
        return MyRankFragment.newInstance();
    }


}