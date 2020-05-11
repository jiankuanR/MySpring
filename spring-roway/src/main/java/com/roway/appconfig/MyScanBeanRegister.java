package com.roway.appconfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: MyScanBeanRegister
 * @create 2020/5/11
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class MyScanBeanRegister implements BeanDefinitionRegistryPostProcessor {
	/**
	 * Modify the application context's internal bean factory after its standard
	 * initialization. All bean definitions will have been loaded, but no beans
	 * will have been instantiated yet. This allows for overriding or adding
	 * properties even to eager-initializing beans.
	 *
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
	}

	/**
	 * Modify the application context's internal bean definition registry after its
	 * standard initialization. All regular bean definitions will have been loaded,
	 * but no beans will have been instantiated yet. This allows for adding further
	 * bean definitions before the next post-processing phase kicks in.
	 *
	 * @param registry the bean definition registry used by the application context
	 * @throws BeansException in case of errors
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(registry);
		scanner.addIncludeFilter(new AnnotationTypeFilter(MyScan.class));
		scanner.scan("com.roway.service");
	}
}
