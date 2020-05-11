package com.roway.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: MyPointCut
 * @create 2020/5/8
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyPointCut {
}
