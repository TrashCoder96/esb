package com.esb.config;

import com.esb.component.PutComponent;
import com.esb.component.SkypeComponent;
import com.esb.component.TelegramComponent;
import com.esb.component.VkComponent;
import com.esb.rest.SkypeController;
import com.esb.rest.TelegramController;
import com.esb.rest.VkController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
