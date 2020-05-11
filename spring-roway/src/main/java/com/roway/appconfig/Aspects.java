package com.roway.appconfig;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName: Asss
 * @Description:
 * @author: Roway
 * @date: ate: 2020-04-15 21:13
 */
@Component
@Aspect
public class Aspects {

	@Pointcut("@annotation(com.roway.annotation.MyPointCut)")
	public void myTest() {}

	@Around("myTest()")
	public Object insertLogic(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("--------------------insertLogic");
		return joinPoint.proceed();
	}

}
