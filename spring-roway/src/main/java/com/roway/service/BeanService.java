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
//@MyScan
@Component
public class BeanService {

	@Autowired
	private IndexService indexService;

}
