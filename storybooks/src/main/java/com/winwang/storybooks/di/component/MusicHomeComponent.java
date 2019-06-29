package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.MusicHomeModule;
import com.winwang.storybooks.mvp.contract.MusicHomeContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.MusicHomeActivity;


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
@ActivityScope
@Component(modules = MusicHomeModule.class, dependencies = AppComponent.class)
public interface MusicHomeComponent {
    void inject(MusicHomeActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MusicHomeComponent.Builder view(MusicHomeContract.View view);

        MusicHomeComponent.Builder appComponent(AppComponent appComponent);

        MusicHomeComponent build();
    }
}