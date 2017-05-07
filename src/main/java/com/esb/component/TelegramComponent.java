package com.esb.component;

import com.esb.service.TelegramService;
import com.esb.service.ro.TelegramMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by itimofeev on 07.05.2017.
 */

@Component
public class TelegramComponent {

	@Autowired
	private TelegramService telegramService;

	public void send(Message<String> message) {
		TelegramMessage telegramMessage = new TelegramMessage();
		telegramMessage.setChat_id("65929604");
		telegramMessage.setText(message.getPayload());
		try {
			telegramService.sendMessage(telegramMessage).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
