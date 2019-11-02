package com.jyf.springlearn.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * 在单例的bean中获取原型的bean，每次获取的都不一样
 * 方法一：用@lookup注解
 *
 */
@Component
public /*abstract*/ class SingletonBean {
	private ProtoBean protoBean;

	//用在抽象方法上
	/*@Lookup
	public abstract ProtoBean getProtoBean();*/

	//用在非抽象方法上，返回值为null,此时类不必定义为abstract
	@Lookup
	public ProtoBean getProtoBean(){
		return null;
	}


}
