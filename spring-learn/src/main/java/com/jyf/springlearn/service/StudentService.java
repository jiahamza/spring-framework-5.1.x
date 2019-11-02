package com.jyf.springlearn.service;

import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service
public class StudentService {
	//加此注解，可以在ac.close()调用时执行close方法
	//@PreDestroy
	public void close(){
		System.out.println("close");
	}
}
