package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.TalksModule;
import com.winwang.storybooks.mvp.contract.TalksContract;

import com.jess.arms.di.scope.FragmentScope;
import com.winwang.storybooks.ui.fragment.TalksFragment;


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
@FragmentScope
@Component(modules = TalksModule.class, dependencies = AppComponent.class)
public interface TalksComponent {
    void inject(TalksFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        TalksComponent.Builder view(TalksContract.View view);

        TalksComponent.Builder appComponent(AppComponent appComponent);

        TalksComponent build();
    }
}