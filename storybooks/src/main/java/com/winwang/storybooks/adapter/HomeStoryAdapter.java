package com.winwang.storybooks.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jess.arms.utils.ArmsUtils;
import com.winwang.storybooks.R;
import com.winwang.storybooks.entity.StoryListBean;

import java.util.List;

/**
 * Created by WinWang on 2019/6/6
 * Description->
 */
public class HomeStoryAdapter extends BaseQuickAdapter<StoryListBean.S1005Bean.Classlist1Bean, BaseViewHolder> {


    private final RequestOptions mRequestOptions;

    public HomeStoryAdapter(int layoutResId, @Nullable List<StoryListBean.S1005Bean.Classlist1Bean> data) {
        super(layoutResId, data);
        mRequestOptions = new RequestOptions();
        mRequestOptions.placeholder(R.drawable.listen_zhanweifu);
        mRequestOptions.error(R.drawable.listen_zhanweifu);
    }

    @Override
    protected void convert(BaseViewHolder helper, StoryListBean.S1005Bean.Classlist1Bean item) {
        ImageView cover = (ImageView) helper.getView(R.id.iv_home_cover);
        helper.setText(R.id.tv_home_title, item.getName());
        Glide.with(mContext).load(item.getPrintscreen()).apply(RequestOptions.bitmapTransform(new RoundedCorners(ArmsUtils.dip2px(mContext, 32)))).apply(mRequestOptions).into(cover);
//        ImageConfigImpl.builder().url(item.getVideoImage()).imageRadius(20).imageView(cover).build();
    }
}
