package com.pattern.adapter.customer;

import com.pattern.adapter.customer.oa.DB;
import com.pattern.adapter.customer.oa.User;
import sun.misc.BASE64Decoder;

import java.io.IOException;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 13:27
 */
public class Main {
	public static void main (String[] args) throws IOException {
		User user = DB.getUser();
		User encode = new com.pattern.adapter.customer.classadapter.UserInfoEncoder().encode(user);
		DB.saveUser(encode);
		String token = encode.getToken();
		System.out.println(token);
		for (int i = 0; i < 3; i++) {
			token = new String((new BASE64Decoder()).decodeBuffer(token));
			System.out.println(token);
		}
		
		System.out.println("--------------------------");
		User user1 = DB.getUser();
		User encode1 = new com.pattern.adapter.customer.objectadapter.UserInfoEncoder().encode(user1);
		DB.saveUser(encode1);
		String token1 = encode1.getToken();
		System.out.println(token1);
		for (int i = 0; i < 3; i++) {
			token1 = new String((new BASE64Decoder()).decodeBuffer(token1));
			System.out.println(token1);
		}
	}
}