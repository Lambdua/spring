package com.lt;

import com.lt.bean.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liangtao
 * @description
 * @date 2021年06月21 15:20
 **/
public class UseDemo {
	public static void main(String[] args) {
//		ApplicationContext context=new AnnotationConfigApplicationContext("com.lt");
		//发布事件
//		A bean = context.getBean(A.class);
//		System.out.println(bean.getName());
//		context.publishEvent(context.getBean(MyEvent.class));

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		A a = context.getBean("a", A.class);
		System.out.println(a.getName());
	}
}
