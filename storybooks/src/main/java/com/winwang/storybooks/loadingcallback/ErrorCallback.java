package com.winwang.storybooks.loadingcallback;


import com.kingja.loadsir.callback.Callback;
import com.winwang.storybooks.R;


public class ErrorCallback extends Callback {
    @Override
    protected int onCreateView() {
        return R.layout.layout_error;
    }
}
