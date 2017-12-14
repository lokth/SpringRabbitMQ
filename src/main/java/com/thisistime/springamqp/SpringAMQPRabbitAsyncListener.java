package com.thisistime.springamqp;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class SpringAMQPRabbitAsyncListener implements MessageListener{

	public void onMessage(Message msg) {
		System.out.println("Listener received message = "+ new String(msg.getBody()));
		
	}

}
