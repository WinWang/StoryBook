package com.winwang.storybooks.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.mvp.IPresenter;
import com.jess.arms.mvp.IView;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.Convertor;
import com.kingja.loadsir.core.LoadService;
import com.kingja.loadsir.core.LoadSir;
import com.winwang.storybooks.entity.BaseBean;
import com.winwang.storybooks.loadingcallback.EmptyCallback;
import com.winwang.storybooks.loadingcallback.ErrorCallback;

/**
 * Created by WinWang on 2019/6/16
 * Description->
 */
public abstract class BasesActivity<P extends IPresenter> extends BaseActivity<P> implements IView {

    protected LoadService mLoadService;
    private int SUCCESS_CODE = 0x00;
    private static final int ERROR_CODE = 0x01;

    @Override
    protected void setLoadingLayout(@Nullable Bundle savedInstanceState) {
        // 重新加载逻辑(配合转换器)
        mLoadService = LoadSir.getDefault().register(this, new Callback.OnReloadListener() {
            @Override
            public void onReload(View v) {
                // 重新加载逻辑
                loadNet();
            }
        }, new Convertor<BaseBean>() {
            @Override
            public Class<? extends Callback> map(BaseBean baseBean) {
                Class<? extends Callback> resultCode = SuccessCallback.class;
                switch (baseBean.getResultcode()) {
                    //成功回调
                    case "0":
                        resultCode = SuccessCallback.class;
                        break;
                    case "400":
                        resultCode = ErrorCallback.class;
                        break;
                    default:
                        resultCode = ErrorCallback.class;
                }
                return resultCode;
            }
        });
    }

    protected void showSuccess() {
        mLoadService.showSuccess();
    }

    protected void showFail() {
        mLoadService.showCallback(ErrorCallback.class);
    }

    protected void showEmpty() {
        mLoadService.showCallback(EmptyCallback.class);
    }

    @Override
    public void onSuccess() {
        mLoadService.showSuccess();
    }

    @Override
    public void onFail() {
        mLoadService.showCallback(ErrorCallback.class);
    }
}
