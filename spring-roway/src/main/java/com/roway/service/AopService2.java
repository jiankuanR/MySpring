package com.roway.service;

import com.roway.annotation.MyPointCut;
import org.springframework.stereotype.Component;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: AopService2
 * @create 2020/5/8
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class AopService2 {

	@MyPointCut
	public void MyAop2Method() {

	}

}
