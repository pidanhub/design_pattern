package com.pattern.interpreter;

public class CopyExpression implements AbstractExpression {
	@Override
	public void interpret (Context context) {
		System.out.println("copy");
	}
}