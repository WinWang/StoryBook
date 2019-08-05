package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.TalkModule;
import com.winwang.storybooks.mvp.contract.TalkContract;

import com.jess.arms.di.scope.ActivityScope;
import com.winwang.storybooks.ui.activity.TalkActivity;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/02/2019 19:52
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = TalkModule.class, dependencies = AppComponent.class)
public interface TalkComponent {
    void inject(TalkActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        TalkComponent.Builder view(TalkContract.View view);

        TalkComponent.Builder appComponent(AppComponent appComponent);

        TalkComponent build();
    }
}