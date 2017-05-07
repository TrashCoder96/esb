package com.esb.service.ro;

/**
 * Created by itimofeev on 07.05.2017.
 */
public class RootEntity {

	private Mes message;

	public Mes getMessage() {
		if (message == null) {
			message = new Mes();
		}
		return message;
	}

	public void setMessage(Mes message) {
		this.message = message;
	}
}
