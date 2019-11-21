package com.roway.test;

import com.roway.appconfig.AppConfig;
import com.roway.beandefinition.CustomerScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.filter.TypeFilter;

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

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();
		CustomerScanner customerScanner = new CustomerScanner(ac);
		customerScanner.addIncludeFilter(null);
		System.out.println(customerScanner.scan("com.roway"));
	}
}
