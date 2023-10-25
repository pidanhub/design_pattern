package com.pattern.state;

import com.pattern.state.tcp.TcpConnection;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 23:39
 */
public class Main {
	public static void main (String[] args) {
		TcpConnection tcpConnection = new TcpConnection();
		tcpConnection.nextState();
		tcpConnection.nextState();
		tcpConnection.nextState();
		tcpConnection.nextState();
		
		TcpConnection tcpConnection1 = new TcpConnection();
		tcpConnection1.nextState();
		tcpConnection1.nextState();
	}
}
