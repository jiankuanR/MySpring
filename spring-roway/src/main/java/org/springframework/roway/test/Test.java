package org.springframework.roway.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.roway.appconfig.AppConfig;
import org.springframework.roway.service.IndexService;

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
//		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("spring.xml");
//		IndexService is = (IndexService) cp.getBean("indexService");
//		is.sayHello();

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService bean = ac.getBean(IndexService.class);
		bean.sayHello();
	}
}
