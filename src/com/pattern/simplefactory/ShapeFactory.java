package com.pattern.simplefactory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 22:58
 */
public class ShapeFactory {
	public final static String CIRCLE = "Circle";
	public final static String Triangle = "Triangle";
	public final static String RECTANGLE = "Rectangle";
	
	public static Shape generate (String shape) {
		switch (shape) {
			case CIRCLE:
				return new Circle();
			case Triangle:
				return new Triangle();
			case RECTANGLE:
				return new Rectangle();
			default:
				System.err.println("Unsupported shape!");
				throw new UnsupportedShapeException();
		}
	}
}
