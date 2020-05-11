package com.roway.appconfig;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationContextHolder implements ApplicationContextAware {
	private static ApplicationContext CONTEXT;

	public ApplicationContextHolder() {
	}

	private static void setContext(ApplicationContext context) {
		CONTEXT = context;
	}

	public static ConfigurableApplicationContext get() {
		return (ConfigurableApplicationContext) CONTEXT;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		if (CONTEXT != null) {
			if (context.getParent() == CONTEXT) {
				setContext(context);
			}
		} else {
			setContext(context);
		}

	}
}