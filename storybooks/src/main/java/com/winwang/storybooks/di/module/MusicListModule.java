package com.winwang.storybooks.di.module;

import android.support.v7.widget.LinearLayoutManager;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

import com.winwang.storybooks.R;
import com.winwang.storybooks.adapter.MusicListAdapter;
import com.winwang.storybooks.entity.MusicListBean;
import com.winwang.storybooks.mvp.contract.MusicListContract;
import com.winwang.storybooks.mvp.model.MusicListModel;

import java.util.ArrayList;
import java.util.List;


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
@Module
public abstract class MusicListModule {

    @Binds
    abstract MusicListContract.Model bindMusicListModel(MusicListModel model);

    @ActivityScope
    @Provides
    static LinearLayoutManager provideLayoutManager(MusicListContract.View mView) {
        return new LinearLayoutManager(mView.getActivity(), LinearLayoutManager.HORIZONTAL, false);
    }


    @ActivityScope
    @Provides
    static List<MusicListBean.ClasslistBean> provideDataList() {
        return new ArrayList<>();
    }


    @ActivityScope
    @Provides
    static MusicListAdapter provideAdapter(List<MusicListBean.ClasslistBean> dataList) {
        return new MusicListAdapter(R.layout.item_music_list_layout, dataList);
    }


}