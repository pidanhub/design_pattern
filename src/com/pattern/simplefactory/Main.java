package com.pattern.simplefactory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 22:58
 */
public class Main {
	public static void main (String[] args) {
		Shape circle = ShapeFactory.generate(ShapeFactory.CIRCLE);
		System.out.println(circle);
		circle.draw();
		circle.erase();
		
		Shape rectangle = ShapeFactory.generate(ShapeFactory.RECTANGLE);
		System.out.println(rectangle);
		rectangle.draw();
		rectangle.erase();
		
		Shape triangle = ShapeFactory.generate(ShapeFactory.Triangle);
		System.out.println(triangle);
		triangle.draw();
		triangle.erase();
	}
}
