package com.pattern.visitor.visitor;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/20 1:09
 */
@FunctionalInterface
public interface CodeReviewVisitor {
	
	void visit (Class<?> args);
}
