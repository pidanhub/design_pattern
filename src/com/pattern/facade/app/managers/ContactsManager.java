package com.pattern.facade.app.managers;

public class ContactsManager {
    private final String contacts;
    
    public ContactsManager (String contacts) {
        this.contacts = contacts;
    }
    
    public void copy () {
        System.out.println(contacts);
    }
}
