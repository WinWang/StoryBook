package com.winwang.storybooks.di.module;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.leochuan.CircleLayoutManager;
import com.leochuan.CircleScaleLayoutManager;
import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.HomeStoryAdapter;
import com.winwang.storybooks.entity.StoryListBean;
import com.winwang.storybooks.mvp.contract.HomeContract;
import com.winwang.storybooks.mvp.model.HomeModel;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Named;


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
@Module
public abstract class HomeModule {

    @Binds
    abstract HomeContract.Model bindHomeModel(HomeModel model);

    @ActivityScope
    @Provides
    static CircleScaleLayoutManager provideLayoutManager(HomeContract.View view) {
        return new CircleScaleLayoutManager(view.getActivity());
    }

    @ActivityScope
    @Provides
    static List<StoryListBean.S1005Bean.Classlist1Bean> storyList() {
        return new ArrayList<>();
    }


    @ActivityScope
    @Provides
    static HomeStoryAdapter provideStoryAdapter(List<StoryListBean.S1005Bean.Classlist1Bean> storyList) {
        return new HomeStoryAdapter(R.layout.item_story_music_home_layout, storyList);
    }

}