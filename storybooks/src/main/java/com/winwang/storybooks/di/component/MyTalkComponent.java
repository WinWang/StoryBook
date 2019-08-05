package com.winwang.storybooks.di.component;

import dagger.BindsInstance;
import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.winwang.storybooks.di.module.MyTalkModule;
import com.winwang.storybooks.mvp.contract.MyTalkContract;

import com.jess.arms.di.scope.FragmentScope;
import com.winwang.storybooks.ui.fragment.MyTalkFragment;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 14:31
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
@Component(modules = MyTalkModule.class, dependencies = AppComponent.class)
public interface MyTalkComponent {
    void inject(MyTalkFragment fragment);

    @Component.Builder
    interface Builder {
        @BindsInstance
        MyTalkComponent.Builder view(MyTalkContract.View view);

        MyTalkComponent.Builder appComponent(AppComponent appComponent);

        MyTalkComponent build();
    }
}