package com.pattern.factory.framework;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 21:57
 */
public interface WebProtocolConnection extends Cloneable {
	
	default WebProtocolConnection create () {
		return initialize().parse().handshake();
	}
	
	WebProtocolConnection initialize (/* attributes */);
	
	WebProtocolConnection parse (/* attributes */);
	
	WebProtocolConnection handshake (/* attributes */);
	
	boolean connect (/* attributes */);
	
	boolean transfer (byte[] bytes);
	
	default void close (WebProtocolConnection me) {
		// 这是一个关闭函数
	}
	
}
