package com.pattern.abstractfactory.factory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/16 0:10
 */
public class MysqlFactory extends Factory {
	
	
	@Override
	public void getStatement () {
		System.out.println("获取mysql的statement");
	}
	
	@Override
	public void getConnection () {
		System.out.println("获取mysql的connection");
	}
}
