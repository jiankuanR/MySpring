package com.roway.beandefinition;

import com.roway.appconfig.MyScan;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: MyScanner
 * @create 2019/11/20
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
public class CustomerScanner extends ClassPathBeanDefinitionScanner {

	public CustomerScanner (BeanDefinitionRegistry beanDefinitionRegistry) {
		super(beanDefinitionRegistry);
	}

}
