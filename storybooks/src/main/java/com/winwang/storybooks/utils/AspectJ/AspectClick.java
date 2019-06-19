package com.winwang.storybooks.utils.AspectJ;

import android.app.Activity;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.blankj.utilcode.util.LogUtils;
import com.jess.arms.utils.ArmsUtils;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.winwang.storybooks.BuildConfig;
import com.winwang.storybooks.utils.NoDoubleClickUtils;
import com.winwang.storybooks.utils.customAnnotation.RequestPermissions;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import io.reactivex.functions.Consumer;

/**
 * Created by WinWang 2019/05/13
 * <p>
 * AspectJ实现双击过滤和特定处理
 */
@Aspect
public class AspectClick {

    final String TAG = AspectClick.class.getSimpleName();

    private boolean isDoubleClick = false;

    /**
     * 支持连续双击状态修改
     *
     * @param joinPoint
     * @throws Throwable
     */
    @Before("execution(@com.winwang.storybooks.utils.customAnnotation.DoubleClick  * *(..))")
    public void beforeEnableDoubleClcik(JoinPoint joinPoint) throws Throwable {
        System.out.println(">>>>>>>>>>>>");
        if (BuildConfig.DEBUG) {
            Log.e(TAG, "beforeEnableDoubleClcik: ");
        }
        isDoubleClick = true;
    }

    /**
     * 单击事件连续点击事件
     *
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around("execution(* android.view.View.OnClickListener.onClick(..))")
    public void onClickLitener(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println(">>>>>>>>>>>>");
        if (BuildConfig.DEBUG) {
            LogUtils.e(TAG, "OnClick单击");
        }
        //只考虑单击
//        if (!NoDoubleClickUtils.isDoubleClick()) {
//            proceedingJoinPoint.proceed();
//        }
        //考虑双击控制
        if (isDoubleClick || !NoDoubleClickUtils.isDoubleClick()) {
            proceedingJoinPoint.proceed();
            isDoubleClick = false;
        }
    }


    @Around("call(* *..*.*(..)) && @annotation(requestPermissions)")
    public void requestPermissions(final ProceedingJoinPoint proceedingJoinPoint, RequestPermissions requestPermissions) throws Exception {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, "----------request permission");
        }
        String[] permissions = requestPermissions.value(); //获取到注解里的权限数组

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            try {
                proceedingJoinPoint.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            return;
        }
        Object target = proceedingJoinPoint.getTarget();
        FragmentActivity activity = null;
        if (target instanceof Activity) {
            activity = (FragmentActivity) target;
        } else if (target instanceof Fragment) {
            activity = ((Fragment) target).getActivity();
        }

        RxPermissions rxPermissions = new RxPermissions(activity);
        rxPermissions.request(permissions)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean granted) throws Exception {
                        if (granted) {
                            try {
                                proceedingJoinPoint.proceed();
                            } catch (Throwable throwable) {
                                throwable.printStackTrace();
                            }
                        } else {
                            ArmsUtils.snackbarText("未获取到权限,不能继续操作");
                        }
                    }
                });

    }


}
