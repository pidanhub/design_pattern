package com.pattern.abstractfactory.factory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/16 0:09
 */
public class OracleFactory extends Factory {
	
	@Override
	public void getStatement () {
		System.out.println("获取oracle的statement");
	}
	
	@Override
	public void getConnection () {
		System.out.println("获取oracle的connection");
	}
}
