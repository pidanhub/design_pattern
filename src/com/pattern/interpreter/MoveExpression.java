package com.pattern.interpreter;

public class MoveExpression implements AbstractExpression {
	@Override
	public void interpret (Context context) {
		System.out.println("move");
	}
}