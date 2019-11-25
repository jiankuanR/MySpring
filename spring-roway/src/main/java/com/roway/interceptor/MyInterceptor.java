package com.roway.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: MyInterceptor
 * @create 2019/11/25
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
public class MyInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("我增加的操作！！！！");
		return methodProxy.invokeSuper(o,null);
	}
}
