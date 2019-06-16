package com.winwang.storybooks.loadingcallback;

import android.content.Context;
import android.view.View;

import com.kingja.loadsir.callback.Callback;
import com.winwang.storybooks.R;




public class LoadingCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.layout_loading;
    }

    @Override
    public boolean getSuccessVisible() {
        return super.getSuccessVisible();
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return true;
    }
}
