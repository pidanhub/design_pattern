package com.pattern.simplefactory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 22:59
 */
public class Circle implements Shape {
	@Override
	public void draw () {
		System.out.println("draw Circle");
	}
	
	@Override
	public void erase () {
		System.out.println("erase Circle");
	}
}
