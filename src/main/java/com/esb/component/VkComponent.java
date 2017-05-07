package com.esb.component;

import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * Created by itimofeev on 07.05.2017.
 */

@Component
public class VkComponent {

	public void send(Message<String> message) {
		System.out.println(message.getHeaders().get("channelType"));
	}

}
