package com.roway.test;

import com.roway.appconfig.E;
import com.roway.interceptor.MyInterceptor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: Cglib
 * @create 2019/11/25
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
public class CglibTest {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(E.class);
		enhancer.setCallback(new MyInterceptor());
		enhancer.setUseFactory(false);
		enhancer.setCallbackType(MyInterceptor.class);
		E e = (E) enhancer.create();
		e.targetMethod();
	}

}
