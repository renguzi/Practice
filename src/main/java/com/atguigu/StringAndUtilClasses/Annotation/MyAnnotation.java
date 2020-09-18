package com.atguigu.StringAndUtilClasses.Annotation;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @Author:asher
 * @Date:2020/9/18 12:35
 * @Description:com.atguigu.StringAndUtilClasses.Annotation
 * @Version:1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE_PARAMETER,METHOD,TYPE_USE})
//@Inherited
public @interface MyAnnotation {
    String value1() default "java";
}
