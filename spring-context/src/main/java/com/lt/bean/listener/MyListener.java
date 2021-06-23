package com.lt.bean.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.GenericApplicationListener;
import org.springframework.core.ResolvableType;

/**
 * @author liangtao
 * @description
 * @date 2021年06月21 15:22
 **/
@Configuration
public class MyListener implements GenericApplicationListener {

	@Override
	public boolean supportsEventType(ResolvableType eventType) {
		System.out.println(eventType.getType().getTypeName());
		return true;
	}

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("监听到事件： "+event);
	}
}
