package com.esb.service.ro;

/**
 * Created by itimofeev on 07.05.2017.
 */
public class TelegramMessage {

	private String text;

	private String chat_id;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getChat_id() {
		return chat_id;
	}

	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}
}
