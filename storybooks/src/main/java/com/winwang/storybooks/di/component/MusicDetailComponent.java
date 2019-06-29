package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.MusicDetailModule;
import com.winwang.storybooks.mvp.contract.MusicDetailContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.MusicDetailActivity;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 06/28/2019 17:22
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = MusicDetailModule.class, dependencies = AppComponent.class)
public interface MusicDetailComponent {
    void inject(MusicDetailActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MusicDetailComponent.Builder view(MusicDetailContract.View view);

        MusicDetailComponent.Builder appComponent(AppComponent appComponent);

        MusicDetailComponent build();
    }
}