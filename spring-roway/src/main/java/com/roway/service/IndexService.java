package com.roway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: IndexService
 * @create 2019/10/17
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class IndexService {

	@Autowired
	private BeanService beanService;

	@PostConstruct
	public void ssss () {

	}
}