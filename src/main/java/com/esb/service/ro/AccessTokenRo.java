package com.esb.service.ro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by itimofeev on 07.05.2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccessTokenRo {

	private String access_token;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

}
