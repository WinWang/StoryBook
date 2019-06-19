package com.winwang.storybooks.utils.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName: SingleClick
 * @Description: java类作用描述
 * @Author: xxy
 * @CreateDate: 2019/5/16 10:20
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface SingleClick {
}

