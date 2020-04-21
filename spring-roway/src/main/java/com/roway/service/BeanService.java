package com.roway.service;

import com.roway.appconfig.MyScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: Bean
 * @create 2019/10/17
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class BeanService {

	@Autowired(required = false)
	public BeanService() {
		System.out.println("default");
	}

	@Autowired(required = false)
	public BeanService(IndexService indexService,String str) {
		System.out.println("BeanService,str");
	}

}
