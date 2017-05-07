package com.esb.config;

import com.esb.component.PutComponent;
import com.esb.component.SkypeComponent;
import com.esb.component.TelegramComponent;
import com.esb.component.VkComponent;
import com.esb.rest.SkypeController;
import com.esb.rest.TelegramController;
import com.esb.rest.VkController;
import com.esb.service.MicrosoftOnlineService;
import com.esb.service.SkypeService;
import com.esb.service.TelegramService;
import com.esb.service.VkService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by itimofeev on 06.05.2017.
 */
@Configuration
public class IntegrationConfig {

	@Bean
	public SkypeController skypeController() {
		return new SkypeController();
	}

	@Bean
	public SkypeComponent skypeComponent() {
		return new SkypeComponent();
	}

	@Bean
	public TelegramController telegramController() {
		return new TelegramController();
	}

	@Bean
	public TelegramComponent telegramComponent() {
		return new TelegramComponent();
	}

	@Bean
	public VkController vkController() {
		return new VkController();
	}

	@Bean
	public VkComponent vkComponent() {
		return new VkComponent();
	}

	@Bean
	public PutComponent putComponent() {
		return new PutComponent();
	}

	@Bean
	public SkypeService skypeService() {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://apis.skype.com")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		return retrofit.create(SkypeService.class);
	}

	@Bean
	public TelegramService telegramService() {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://api.telegram.org/bot242602246:AAEkJJ4UFTPFBp1z2S6o9RQAomofY70qMZ0/")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		return retrofit.create(TelegramService.class);
	}

	@Bean
	public VkService vkService() {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://api.vk.com/method/")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		return retrofit.create(VkService.class);
	}

	@Bean
	public MicrosoftOnlineService microsoftOnlineService() {
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl("https://login.microsoftonline.com")
				.addConverterFactory(JacksonConverterFactory.create())
				.build();
		return retrofit.create(MicrosoftOnlineService.class);
	}

}
