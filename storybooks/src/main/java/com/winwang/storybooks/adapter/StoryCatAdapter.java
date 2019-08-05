package com.winwang.storybooks.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.winwang.storybooks.entity.StoryInListBean;

import java.util.List;

/**
 * Created by WinWang on 2019/7/3
 * Description->
 */
public class StoryCatAdapter extends BaseQuickAdapter<StoryInListBean.CategoryListBean, BaseViewHolder> {

    public StoryCatAdapter(int layoutResId, @Nullable List<StoryInListBean.CategoryListBean> data) {
        super(layoutResId, data);

    }

    @Override
    protected void convert(BaseViewHolder helper, StoryInListBean.CategoryListBean item) {

    }
}
