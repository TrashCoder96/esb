package com.esb.component;

import com.esb.types.ChannelType;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by itimofeev on 07.05.2017.
 */

@Component
public class PutComponent {

	public Message<String> send() {

		Random r = new Random();
		int i = r.nextInt(3);

		if (i == 0) {
			return MessageBuilder.withPayload("skype").
					setHeader("channelType", ChannelType.SKYPE_CHANNEL).build();
		}
		if (i == 1) {
			return MessageBuilder.withPayload("vk").
					setHeader("channelType", ChannelType.VK_CHANNEL).build();
		}
		if (i == 2) {
			return MessageBuilder.withPayload("telegram").
					setHeader("channelType", ChannelType.TELEGRAM_CHANNEL).build();
		}
		return MessageBuilder.withPayload("telegram").
				setHeader("channelType", ChannelType.TELEGRAM_CHANNEL).build();
	}

}
