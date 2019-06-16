package com.winwang.storybooks.app;

import com.jess.arms.base.BaseApplication;
import com.kingja.loadsir.core.LoadSir;
import com.winwang.storybooks.loadingcallback.CustomCallback;
import com.winwang.storybooks.loadingcallback.EmptyCallback;
import com.winwang.storybooks.loadingcallback.ErrorCallback;
import com.winwang.storybooks.loadingcallback.LoadingCallback;
import com.winwang.storybooks.loadingcallback.TimeoutCallback;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

/**
 * Created by WinWang on 2019/6/6
 * Description->
 */
public class MyApp extends BaseApplication {

    @Override
    public void onCreate() {
        configUnits();
        super.onCreate();
        initLoding();
    }

    /**
     * 初始化loading加载
     */
    private void initLoding() {
        LoadSir.beginBuilder()
                .addCallback(new ErrorCallback())//添加各种状态页
                .addCallback(new EmptyCallback())
                .addCallback(new LoadingCallback())
                .addCallback(new TimeoutCallback())
                .addCallback(new CustomCallback())
                .setDefaultCallback(LoadingCallback.class)//设置默认状态页
                .commit();
    }

    /**
     * 初始化屏幕适配
     */
    private void configUnits() {
        me.jessyan.autosize.utils.LogUtils.setDebug(false);
        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.PT);
    }

}
