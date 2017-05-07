package com.esb.component;

import com.esb.service.MicrosoftOnlineService;
import com.esb.service.SkypeService;
import com.esb.service.ro.RootEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by itimofeev on 07.05.2017.
 */

@Component
public class SkypeComponent {

	@Autowired
	private SkypeService skypeService;

	@Autowired
	private MicrosoftOnlineService microsoftOnlineService;

	public void send(Message<String> message) {
		try {
			String token = microsoftOnlineService.updateToken("client_credentials", "3f964e45-49d2-4f12-91f9-2930b62c4268", "br7YuohqAywSdodzEaGySox", "https://graph.microsoft.com/.default").execute().body().getAccess_token();
			RootEntity rootEntity = new RootEntity();
			rootEntity.getMessage().setContent(message.getPayload());
			skypeService.sendMessage("Bearer " + token, "1:kiberaction@yandex.ru", rootEntity).execute();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
