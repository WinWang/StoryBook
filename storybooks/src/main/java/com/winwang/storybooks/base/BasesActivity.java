package com.winwang.storybooks.base;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.TextView;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.mvp.IPresenter;
import com.jess.arms.mvp.IView;
import com.jess.arms.utils.ArmsUtils;
import com.kingja.loadsir.callback.Callback;
import com.kingja.loadsir.callback.SuccessCallback;
import com.kingja.loadsir.core.Convertor;
import com.kingja.loadsir.core.LoadService;
import com.kingja.loadsir.core.LoadSir;
import com.qmuiteam.qmui.widget.QMUITopBar;
import com.qmuiteam.qmui.widget.dialog.QMUITipDialog;
import com.winwang.storybooks.R;
import com.winwang.storybooks.entity.BaseBean;
import com.winwang.storybooks.loadingcallback.EmptyCallback;
import com.winwang.storybooks.loadingcallback.ErrorCallback;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import me.jessyan.autosize.AutoSizeCompat;

import static com.jess.arms.utils.Preconditions.checkNotNull;

/**
 * Created by WinWang on 2019/6/16
 * Description->
 */
public abstract class BasesActivity<P extends IPresenter> extends BaseActivity<P> implements IView {

    protected LoadService mLoadService;
    private int SUCCESS_CODE = 0x00;
    private static final int ERROR_CODE = 0x01;
    protected QMUITopBar topBar;
    protected TextView mTitle;
    private QMUITipDialog tipDialog;
    protected CompositeDisposable mCompositeDisposable;

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

    @Override
    protected void initTopBar() {
        topBar = (QMUITopBar) findViewById(R.id.qm_topbar);
        if (topBar != null) {
            topBar.setBackgroundColor(ContextCompat.getColor(this, R.color.qmui_config_color_transparent));
            if (isShowBack()) {
                View backLeft = View.inflate(this, R.layout.view_left_back, null);
                mTitle = (TextView) backLeft.findViewById(R.id.tv_title);
                AssetManager mgr = getAssets();
                Typeface tf = Typeface.createFromAsset(mgr, "fonts/heilizhi.ttf");
                mTitle.setTypeface(tf);
                topBar.addLeftView(backLeft, R.id.topbar_left_back_img);
                backLeft.setOnClickListener(v -> {
                    onBackPressed();
                });

            }
        }
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

    protected boolean isShowBack() {
        return true;
    }

    protected void setTitle(String title) {
        if (mTitle != null) {
            mTitle.setText(title);
        }
    }

    @Override
    public void showLoading() {
        if (tipDialog == null) {
            tipDialog = new QMUITipDialog.Builder(mContext)
                    .setIconType(QMUITipDialog.Builder.ICON_TYPE_LOADING)
                    .setTipWord("正在加载")
                    .create();
            tipDialog.show();
        } else {
            tipDialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (tipDialog != null) {
            tipDialog.dismiss();
        }
    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    public void addDispose(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);//将所有 Disposable 放入容器集中处理
    }

    /**
     * 停止集合中正在执行的 RxJava 任务
     */
    public void unDispose() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();//保证 Activity 结束时取消所有正在执行的订阅
        }
    }

    @Override
    protected void onDestroy() {
        mCompositeDisposable = null;
        super.onDestroy();
    }

    @Override
    public Resources getResources() {
        AutoSizeCompat.autoConvertDensityOfGlobal((super.getResources()));
        return super.getResources();

    }
}
