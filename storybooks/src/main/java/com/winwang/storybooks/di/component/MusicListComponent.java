package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.MusicListModule;
import com.winwang.storybooks.mvp.contract.MusicListContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.MusicListActivity;


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
@ActivityScope
@Component(modules = MusicListModule.class, dependencies = AppComponent.class)
public interface MusicListComponent {
    void inject(MusicListActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MusicListComponent.Builder view(MusicListContract.View view);

        MusicListComponent.Builder appComponent(AppComponent appComponent);

        MusicListComponent build();
    }
}