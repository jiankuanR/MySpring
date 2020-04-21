package com.roway.appconfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

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
public class AppConfig {

	@Bean
	public E e() {
		return new E();
	}
}
