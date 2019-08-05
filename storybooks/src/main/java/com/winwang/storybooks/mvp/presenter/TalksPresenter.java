package com.winwang.storybooks.mvp.presenter;

import android.app.Application;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONObject;
import com.blankj.utilcode.util.EncryptUtils;
import com.jess.arms.integration.AppManager;
import com.jess.arms.di.scope.FragmentScope;
import com.jess.arms.mvp.BasePresenter;
import com.jess.arms.http.imageloader.ImageLoader;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;
import me.jessyan.rxerrorhandler.handler.ErrorHandleSubscriber;
import okhttp3.MediaType;
import okhttp3.RequestBody;

import javax.inject.Inject;

import com.jess.arms.utils.LogUtils;
import com.jess.arms.utils.RxLifecycleUtils;
import com.winwang.storybooks.AppConfig;
import com.winwang.storybooks.adapter.TalksAdapter;
import com.winwang.storybooks.entity.TalkBean;
import com.winwang.storybooks.mvp.contract.TalksContract;

import java.util.List;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/03/2019 16:50
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@FragmentScope
public class TalksPresenter extends BasePresenter<TalksContract.Model, TalksContract.View> {
    @Inject
    RxErrorHandler mErrorHandler;
    @Inject
    Application mApplication;
    @Inject
    ImageLoader mImageLoader;
    @Inject
    AppManager mAppManager;

    @Inject
    List<TalkBean.ListBean> dataList;
    @Inject
    TalksAdapter mAdapter;


    @Inject
    public TalksPresenter(TalksContract.Model model, TalksContract.View rootView) {
        super(model, rootView);
    }


    public void getTalkList(int pageIndex, int workType) {
        JSONObject json = new JSONObject();
        json.put("version", "1.2.3.2");
        json.put("merchantid", "10000");
        json.put("command", "1270");
        json.put("clienttype", "3");
        json.put("clientversion", "1.2.3.2");
        json.put("IMEI", "864329033907351");
        json.put("UserID", "225903");
        json.put("advsource", "Oppo");
        json.put("Pagesize", "12");
        json.put("PageIndex", pageIndex);
        json.put("WorkType", workType);
        String letters = "1.2.3.210000127031.2.3.2864329033907351225903Oppo" + workType + "12" + pageIndex + AppConfig.MD5_KEY;
        LogUtils.debugInfo(letters);
        String sign = EncryptUtils.encryptMD5ToString(letters).toLowerCase();
        json.put("md", sign);
        String jsonString = json.toJSONString();
        RequestBody requestBody = RequestBody.create(MediaType.parse("text/plain"), jsonString);

        mModel.getTalkList(requestBody)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .compose(RxLifecycleUtils.bindToLifecycle(mRootView))
                .subscribe(new ErrorHandleSubscriber<TalkBean>(mErrorHandler) {
                    @Override
                    public void onNext(TalkBean talkBean) {
                        if (TextUtils.equals(talkBean.getResultcode(), "0")) {
                            dataList.addAll(talkBean.getList());
                            mAdapter.notifyDataSetChanged();
                        }
                    }
                });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mErrorHandler = null;
        this.mAppManager = null;
        this.mImageLoader = null;
        this.mApplication = null;
        this.mAdapter = null;
        this.dataList = null;
    }
}
