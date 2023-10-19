package com.pattern.facade.app;

import com.pattern.facade.app.managers.ContactsManager;
import com.pattern.facade.app.managers.MessageManager;
import com.pattern.facade.app.managers.PhotoManager;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:33
 */
public class Facade {
	
	private final ContactsManager contacts;
	private final MessageManager message;
	private final PhotoManager photo;
	
	public Facade () {
		this.contacts = new ContactsManager("备份通讯录");
		this.message = new MessageManager("备份短信");
		this.photo = new PhotoManager("备份照片");
	}
	
	public void backup () {
		contacts.copy();
		message.copy();
		photo.copy();
	}
}
