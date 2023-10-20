package com.pattern.visitor.visitor.impl;

import com.pattern.visitor.visitor.CodeReviewVisitor;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/*
 * @Author Zzs
 * @Description 提取标识符名称，以便检查命名是否合法和规范。可以提取类名、属性名和方法名等。
 * @DateTime 2023/10/20 13:26
 */
public class NameStandardVisitor implements CodeReviewVisitor {
	@Override
	public void visit (Class<?> args) {
		System.out.println("check if names meet standard...");
		System.out.println("class name: " + args.getName());
		Field[] declaredFields = args.getDeclaredFields();
		Set<String> fieldNameSet = new HashSet<>();
		Stream.of(declaredFields).forEach((i) -> fieldNameSet.add(i.getName()));
		
		Method[] declaredMethods = args.getDeclaredMethods();
		Set<String> methodsNameSet = new HashSet<>();
		Stream.of(declaredMethods).forEach((i) -> methodsNameSet.add(i.getName()));
		System.out.println("field names: " + fieldNameSet);
		System.out.println("method names: " + methodsNameSet);
		System.out.println();
	}
	
}
