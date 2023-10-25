package com.pattern.state.tcp;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 23:48
 */
public class TcpConnection {
	
	private TcpState tcpState = TcpState.Closed;
	
	public TcpConnection () {
		System.out.println("aiming at create a tcp connection, state is at " + tcpState.name() + " now.");
	}
	
	public TcpConnection nextState () {
		System.out.println("form " + tcpState.name() + " to " + tcpState.nextState() + ".");
		tcpState = tcpState.nextState();
		return this;
	}
}
