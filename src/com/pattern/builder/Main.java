package com.pattern.builder;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:16
 */
public class Main {
	public static void main (String[] args) {
		System.out.println("main：假设玩家随意选择了方程式车");
		// 登场角色是director
		Director director = new Director(new FormulaCarBuilder());
		Car car = director.makeCar();
		System.out.println("main：看看咱的车");
		System.out.println(car);
	}
}
