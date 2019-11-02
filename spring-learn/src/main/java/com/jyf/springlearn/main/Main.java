package com.jyf.springlearn.main;

import com.jyf.springlearn.config.AppConfig;
import com.jyf.springlearn.lookup.SingletonBean;
import com.jyf.springlearn.lookup.SingletonBean2;
import com.jyf.springlearn.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {

		testCloseMethod();

		//testProtoInSingle();
	}

	private static void testCloseMethod() {
		//既可以通过@PreDestry注解实现，也可以通过实现BeanFactoryPostProcessor接口实现功能
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService bean = ac.getBean(StudentService.class);
		System.out.println(bean);
		ac.close();
	}

	private static void testProtoInSingle() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//用@lookup
		SingletonBean singletonBean = ac.getBean(SingletonBean.class);
		System.out.println(singletonBean.getProtoBean());
		System.out.println(singletonBean.getProtoBean());
		System.out.println(singletonBean.getProtoBean());
		//用实现ApplicationContextAware接口的方式（不好）
		SingletonBean2 singletonBean2 = ac.getBean(SingletonBean2.class);
		System.out.println(singletonBean2.getProtoBean());
		System.out.println(singletonBean2.getProtoBean());
		System.out.println(singletonBean2.getProtoBean());
	}
}
