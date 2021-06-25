package com.lt.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author liangtao
 * @description
 * @date 2021年06月21 15:20
 **/
@Component
public class B {
	private String name="bb";

	@Autowired
	private A a;

	public B(String name) {
		this.name = name;
	}

	public B() {
	}

	public void setA(A a) {
		this.a = a;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
