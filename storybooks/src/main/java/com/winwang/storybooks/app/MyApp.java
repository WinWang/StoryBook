package com.winwang.storybooks.app;

import android.content.Context;
import android.support.multidex.MultiDex;

import com.alibaba.android.arouter.launcher.ARouter;
import com.jess.arms.base.BaseApplication;
import com.kingja.loadsir.core.LoadSir;
import com.shuyu.gsyvideoplayer.player.IjkPlayerManager;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.loadingcallback.CustomCallback;
import com.winwang.storybooks.loadingcallback.EmptyCallback;
import com.winwang.storybooks.loadingcallback.ErrorCallback;
import com.winwang.storybooks.loadingcallback.LoadingCallback;
import com.winwang.storybooks.loadingcallback.TimeoutCallback;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

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
        IjkPlayerManager.setLogLevel(IjkMediaPlayer.IJK_LOG_SILENT);//关闭IJKlog日志
        initArouter();
    }

    private void initArouter() {
        if (AppConfig.Debug) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
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

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }


}
