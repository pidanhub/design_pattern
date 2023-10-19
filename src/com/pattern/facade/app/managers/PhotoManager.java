package com.pattern.facade.app.managers;

public class PhotoManager {
	private final String photo;
	
	public PhotoManager (String photo) {
		this.photo = photo;
	}
	
	public void copy () {
		System.out.println(photo);
	}
}