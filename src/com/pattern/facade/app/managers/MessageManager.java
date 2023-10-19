package com.pattern.facade.app.managers;

public class MessageManager {
	private final String message;
	
	public MessageManager (String message) {
		this.message = message;
	}
	
	public void copy () {
		System.out.println(message);
	}
}