package com.pattern.factory.framework;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 22:49
 */
public class POP3Connection implements WebProtocolConnection {
	
	@Override
	public WebProtocolConnection initialize () {
		return this;
	}
	
	@Override
	public WebProtocolConnection parse () {
		return this;
	}
	
	@Override
	public WebProtocolConnection handshake () {
		return this;
	}
	
	@Override
	public boolean connect () {
		System.out.println("pop3 connected");
		return true;
	}
	
	@Override
	public boolean transfer (byte[] bytes) {
		return true;
	}
}
