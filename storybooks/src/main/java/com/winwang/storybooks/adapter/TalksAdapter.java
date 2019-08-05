package com.winwang.storybooks.adapter;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.winwang.storybooks.R;
import com.winwang.storybooks.entity.TalkBean;

import java.util.List;

/**
 * Created by WinWang on 2019/7/3
 * Description->
 */
public class TalksAdapter extends BaseQuickAdapter<TalkBean.ListBean, BaseViewHolder> {

    public TalksAdapter(int layoutResId, @Nullable List<TalkBean.ListBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TalkBean.ListBean item) {
        String name = item.getName();
        helper.setText(R.id.tv_talk_title,name);
        ImageView cover = (ImageView) helper.getView(R.id.iv_talk_cover);
        Glide.with(mContext).load(item.getImage()).apply(RequestOptions.bitmapTransform(new RoundedCorners(40))).into(cover);
    }
}
