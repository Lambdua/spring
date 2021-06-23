package com.lt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liangtao
 * @description
 * @date 2021年06月21 15:20
 **/
@Component
public class A {
	private String name="aa";

	@Autowired
	private B b;

	public A(String name) {
		this.name = name;
	}

	public A() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
