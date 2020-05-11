package com.roway.service;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: TransactionalService
 * @create 2020/5/8
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class TransactionalService {

	@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRED)
	public void sayTransaction() {
		System.out.println("sayTransaction");
	}

}
