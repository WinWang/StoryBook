package com.winwang.storybooks.di.module;

import android.support.v7.widget.GridLayoutManager;

import com.jess.arms.di.scope.FragmentScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.TalksAdapter;
import com.winwang.storybooks.entity.TalkBean;
import com.winwang.storybooks.mvp.contract.TalksContract;
import com.winwang.storybooks.mvp.model.TalksModel;

import java.util.ArrayList;
import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 16:50
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@Module
public abstract class TalksModule {

    @Binds
    abstract TalksContract.Model bindTalksModel(TalksModel model);


    @FragmentScope
    @Provides
    static List<TalkBean.ListBean> provideDataList() {
        return new ArrayList<>();
    }

    @FragmentScope
    @Provides
    static TalksAdapter provideAdapter(List<TalkBean.ListBean> dataList) {
        return new TalksAdapter(R.layout.item_talk_rank_layout, dataList);
    }

    @FragmentScope
    @Provides
    static GridLayoutManager provideManager(TalksContract.View view) {
        return new GridLayoutManager(view.getContexts(), 3);
    }


}