package com.pattern.abstractfactory;

import com.pattern.abstractfactory.factory.Factory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/15 23:50
 */
public class Main {
	public static void main (String[] args) {
		try {
			Factory factory = Factory.getFactory("config.properties");
			factory.getConnection();
			factory.getStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
