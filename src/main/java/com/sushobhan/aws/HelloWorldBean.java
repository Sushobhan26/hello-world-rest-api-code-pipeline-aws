package com.sushobhan.aws;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean() {

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	

}
