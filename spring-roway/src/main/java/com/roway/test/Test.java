package com.roway.test;

import com.roway.appconfig.AppConfig;
import com.sun.istack.internal.NotNull;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: Test
 * @create 2019/10/17
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
