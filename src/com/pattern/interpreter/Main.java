package com.pattern.interpreter;

/*
 * @Author Zzs
 * @Description 解释器模式通常用于自定义语言的解释和执行。Interpreter mode is often used for the interpretation and execution of custom languages.
 * @DateTime 2023/10/25 22:10
 */
public class Main {
	@SuppressWarnings ("all")
	public static void main (String[] args) {
		String input = "COPY VIEW FROM srcDB TO desDB";
		
		Context context = new Context();
		AbstractExpression expression;
		if (input.startsWith("COPY")) {
			expression = new CopyExpression();
		}
		else if (input.startsWith("MOVETABLE")) {
			expression = new MoveExpression();
		}
		else {
			throw new RuntimeException();
		}
		
		expression.interpret(context);
	}
}
