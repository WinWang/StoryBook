package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.MyRankModule;
import com.winwang.storybooks.mvp.contract.MyRankContract;

import com.jess.arms.di.scope.FragmentScope;
import com.winwang.storybooks.ui.fragment.MyRankFragment;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 14:32
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
@Component(modules = MyRankModule.class, dependencies = AppComponent.class)
public interface MyRankComponent {
    void inject(MyRankFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MyRankComponent.Builder view(MyRankContract.View view);

        MyRankComponent.Builder appComponent(AppComponent appComponent);

        MyRankComponent build();
    }
}