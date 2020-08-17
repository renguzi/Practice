package com.atguigu.Reflection.GetClassStructure;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @Author:asher
 * @Date:2020/8/15 19:16
 * @Description:com.atguigu.Reflection.GetClassStructure
 * @Version:1.0
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {

    String value() default "hello";
}
