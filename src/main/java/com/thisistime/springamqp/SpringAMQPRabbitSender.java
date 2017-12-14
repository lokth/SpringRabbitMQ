package com.thisistime.springamqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAMQPRabbitSender {
	
	private final static String SENDER_XML ="springamqp-rabbit-sender-context.xml";
	
	public static void main(String[] agrs) throws Exception {
		AmqpTemplate amqpTemplate = (AmqpTemplate) (new ClassPathXmlApplicationContext(SENDER_XML)).getBean("amqpTemplate");
	
		int messageCount = 0;
		while(messageCount < 10) {
			amqpTemplate.convertAndSend("tp.rountingkey.1", "Message # " + messageCount++);
		}
		System.out.println(messageCount + "message(s) sent successfully.");
		
	}

}
