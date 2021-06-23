package com.lt.bean.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.stereotype.Component;

/**
 * @author liangtao
 * @description 自定义事件
 * @date 2021年06月21 15:42
 **/
@Component
@SuppressWarnings("serial")
public class MyEvent extends ApplicationContextEvent {

	public MyEvent(ApplicationContext source) {
		super(source);
	}
}
