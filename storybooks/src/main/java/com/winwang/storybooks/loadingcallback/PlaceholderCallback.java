package com.winwang.storybooks.loadingcallback;

import android.content.Context;
import android.view.View;

import com.kingja.loadsir.callback.Callback;
import com.winwang.storybooks.R;


public class PlaceholderCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.layout_placeholder;
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return true;
    }
}
