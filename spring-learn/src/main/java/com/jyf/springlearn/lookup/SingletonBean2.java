package com.jyf.springlearn.lookup;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *  在单例的bean中获取原型的bean，每次获取的都不一样
 *  方法二：实现ApplicationContextAware接口
 *
 *  不推荐，侵入性强
 */
@Component
public class SingletonBean2 implements ApplicationContextAware {
	private ProtoBean protoBean;
	private ApplicationContext applicationContext;
	public ProtoBean getProtoBean() {
		return applicationContext.getBean(ProtoBean.class);
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
