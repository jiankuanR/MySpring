package com.roway.appconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: AppConfig
 * @create 2019/10/17
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@ComponentScan("com.roway")
@Configuration
//@EnableAspectJAutoProxy()
//@EnableTransactionManagement
//@EnableAsync
public class AppConfig {

	@Bean
	public E e() {
		return new E();
	}
}
