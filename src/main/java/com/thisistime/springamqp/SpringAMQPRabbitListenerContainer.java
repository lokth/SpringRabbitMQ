package com.thisistime.springamqp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPRabbitListenerContainer {
	
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("springamqp-rabbit-listener-context.xml");
	}

}
