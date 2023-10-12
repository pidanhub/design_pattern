package com.pattern.factory.framework;

import java.util.NoSuchElementException;

/*
 * @Author Zzs
 * @Description 提供连接类的工厂类，且持续在拓展支持更多的网络协议
 * @DateTime 2023/10/12 21:55
 */
public class ConnectionFactory {
	
	public static WebProtocolConnection create (ConnectionType connectionType) {
		switch (connectionType) {
			case POP3:
				return new POP3Connection().create();
			case IMAP:
				return new IMAPConnection().create();
			case HTTP:
				return new HTTPConnection().create();
		}
		throw new NoSuchElementException("No this connection type.");
	}
	
	public enum ConnectionType {
		POP3(),
		IMAP(),
		HTTP(),
	}
	
}
