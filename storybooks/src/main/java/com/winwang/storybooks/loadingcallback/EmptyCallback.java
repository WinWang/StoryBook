package com.winwang.storybooks.loadingcallback;

import com.kingja.loadsir.callback.Callback;
import com.winwang.storybooks.R;



public class EmptyCallback extends Callback {

    @Override
    protected int onCreateView() {
        return R.layout.layout_empty;
    }

}
