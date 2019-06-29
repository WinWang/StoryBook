package com.winwang.storybooks.di.module;

import android.support.v7.widget.LinearLayoutManager;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.MusicHomeAdapter;
import com.winwang.storybooks.entity.MusicHomeBean;
import com.winwang.storybooks.mvp.contract.MusicHomeContract;
import com.winwang.storybooks.mvp.model.MusicHomeModel;

import java.util.ArrayList;
import java.util.List;


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
@Module
public abstract class MusicHomeModule {

    @Binds
    abstract MusicHomeContract.Model bindMusicHomeModel(MusicHomeModel model);


    @ActivityScope
    @Provides
    static LinearLayoutManager provideLayoutManager(MusicHomeContract.View mView) {
        return new LinearLayoutManager(mView.getActivity(),LinearLayoutManager.HORIZONTAL,false);
    }


    @ActivityScope
    @Provides
    static List<MusicHomeBean.ListBean> provideList() {
        return new ArrayList<>();
    }

    @ActivityScope
    @Provides
    static MusicHomeAdapter provideAdatper(List<MusicHomeBean.ListBean> dataList) {
        return new MusicHomeAdapter(R.layout.item_music_home_layout, dataList);
    }


}