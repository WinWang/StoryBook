package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.StoryListModule;
import com.winwang.storybooks.mvp.contract.StoryListContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.StoryListActivity;


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
@ActivityScope
@Component(modules = StoryListModule.class, dependencies = AppComponent.class)
public interface StoryListComponent {
    void inject(StoryListActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        StoryListComponent.Builder view(StoryListContract.View view);

        StoryListComponent.Builder appComponent(AppComponent appComponent);

        StoryListComponent build();
    }
}