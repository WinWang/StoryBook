package com.winwang.storybooks.di.module;

import android.support.v7.widget.LinearLayoutManager;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.MusicListAdapter;
import com.winwang.storybooks.adapter.StoryListAdapter;
import com.winwang.storybooks.entity.MusicListBean;
import com.winwang.storybooks.entity.StoryInListBean;
import com.winwang.storybooks.mvp.contract.MusicListContract;
import com.winwang.storybooks.mvp.contract.StoryListContract;
import com.winwang.storybooks.mvp.model.StoryListModel;

import java.util.ArrayList;
import java.util.List;


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
@Module
public abstract class StoryListModule {

    @Binds
    abstract StoryListContract.Model bindStoryListModel(StoryListModel model);

    @ActivityScope
    @Provides
    static LinearLayoutManager provideLayoutManager(StoryListContract.View mView) {
        return new LinearLayoutManager(mView.getActivity(), LinearLayoutManager.HORIZONTAL, false);
    }


    @ActivityScope
    @Provides
    static List<StoryInListBean.ClasslistBean> provideDataList() {
        return new ArrayList<>();
    }


    @ActivityScope
    @Provides
    static StoryListAdapter provideAdapter(List<StoryInListBean.ClasslistBean> dataList) {
        return new StoryListAdapter(R.layout.item_story_list_layout, dataList);
    }


}