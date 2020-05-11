package com.roway.test;

import com.roway.appconfig.AppConfig;
import com.roway.service.AopService1;
import com.roway.service.IndexService;
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
		AopService1 bean = ac.getBean(AopService1.class);
		System.out.println(bean);
		bean.MyAop1Method();
	}
}
