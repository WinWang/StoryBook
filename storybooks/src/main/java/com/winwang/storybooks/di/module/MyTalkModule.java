package com.winwang.storybooks.di.module;

import android.support.v4.app.Fragment;

import com.jess.arms.base.AdapterViewPager;
import com.jess.arms.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.mvp.contract.MyTalkContract;
import com.winwang.storybooks.mvp.model.MyTalkModel;
import com.winwang.storybooks.ui.fragment.TalksFragment;

import java.util.ArrayList;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 14:31
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class MyTalkModule {

    static String[] titles = {"故事", "儿歌", "唐诗", "国学"};

    @Binds
    abstract MyTalkContract.Model bindMyTalkModel(MyTalkModel model);


    @FragmentScope
    @Provides
    static AdapterViewPager provideVpAdapter(MyTalkContract.View view) {
        ArrayList<Fragment> fragments = new ArrayList<>();
        for (String title : titles) {
            fragments.add(TalksFragment.newInstance());
        }
        return new AdapterViewPager(view.getFragment().getChildFragmentManager(), fragments, titles);
    }


}