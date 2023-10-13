package com.pattern.simplefactory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:01
 */
public class Triangle implements Shape {
	@Override
	public void draw () {
		System.out.println("draw Triangle");
	}
	
	@Override
	public void erase () {
		System.out.println("erase Triangle");
	}
}
