package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.VideoDetailModule;
import com.winwang.storybooks.mvp.contract.VideoDetailContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.VideoDetailActivity;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/13/2019 19:33
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = VideoDetailModule.class, dependencies = AppComponent.class)
public interface VideoDetailComponent {
    void inject(VideoDetailActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        VideoDetailComponent.Builder view(VideoDetailContract.View view);

        VideoDetailComponent.Builder appComponent(AppComponent appComponent);

        VideoDetailComponent build();
    }
}