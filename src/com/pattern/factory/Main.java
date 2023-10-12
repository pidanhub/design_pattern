package com.pattern.factory;

import com.pattern.factory.framework.ConnectionFactory;
import com.pattern.factory.framework.WebProtocolConnection;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 13:26
 */
public class Main {
	public static void main (String[] args) {
		WebProtocolConnection webProtocolConnection = ConnectionFactory.create(ConnectionFactory.ConnectionType.HTTP);
		// 证明我创建成功
		System.out.println(webProtocolConnection);
		
		if (!webProtocolConnection.connect()) {
			System.out.println("连接失败！");
		}
		
		if (webProtocolConnection.transfer(new byte[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 })) {
			System.out.println("传输成功！");
		}
	}
}
