package com.jyf.springlearn.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * ac.close()调用时，执行studentService中close方法（不加@PreDestroy）的另一种做法（鸡肋）
 */
@Component
public class TestBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition studentService = beanFactory.getBeanDefinition("studentService");
		studentService.setDestroyMethodName(AbstractBeanDefinition.INFER_METHOD);

	}

}
