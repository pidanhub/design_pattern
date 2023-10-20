package com.pattern.visitor.visitor.impl;

import com.pattern.visitor.visitor.CodeReviewVisitor;

import java.lang.reflect.Method;

/*
 * @Author Zzs
 * @Description 度量软件规模。可以统计源代码中类的个数、每个类属性的个数以及每个类方法的个数等。
 * @DateTime 2023/10/20 12:29
 */
public class SoftwareScaleVisitor implements CodeReviewVisitor {
	@Override
	public void visit (Class<?> args) {
		System.out.println("visit software scale...");
		System.out.println("class name: " + args.getName());
		System.out.println("属性个数：" + args.getDeclaredFields().length);
		Method[] declaredMethods = args.getDeclaredMethods();
		System.out.println("方法个数：" + declaredMethods.length);
		System.out.println();
	}
}
