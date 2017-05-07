package com.esb.component;

import com.esb.service.VkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by itimofeev on 07.05.2017.
 */

@Component
public class VkComponent {

	@Autowired
	private VkService vkService;

	public void send(Message<String> message) {
		try {
			vkService.sendMessage("033dd46a7e00d92da70b77b18cabcc730c29af354c8439a2c89a9afbcbaa04dd8b778dbf8a33a98d08b02", "248995866", message.getPayload()).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
