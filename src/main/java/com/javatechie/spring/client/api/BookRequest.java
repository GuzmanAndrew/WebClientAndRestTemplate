package com.javatechie.spring.client.api;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

public class BookRequest {
	@JsonIgnore
	private String authKey;
	@JsonIgnore
	private String text;

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
