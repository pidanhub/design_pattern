package com.pattern.visitor.test;

import com.pattern.visitor.visitor.CodeReviewVisitor;
import com.pattern.visitor.visitor.impl.CheckLinesVisitor;
import com.pattern.visitor.visitor.impl.NameStandardVisitor;
import com.pattern.visitor.visitor.impl.SoftwareScaleVisitor;

import java.util.Map;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/20 12:29
 */
public class Test {
	// test
	public final static String TEST_UNDERLINE = "_";
	
	static {
		new Test().accept(
				new SoftwareScaleVisitor(),
				new NameStandardVisitor(),
				new CheckLinesVisitor()
		);
	}
	
	public void accept (CodeReviewVisitor... visitors) {
		for (CodeReviewVisitor visitor : visitors) {
			visitor.visit(this.getClass());
		}
	}
	
	public void test (String s, Integer i, Float f, Map<Class<?>, Object> m) {
	}
	
	private void testPrivate () {
	
	}
}
