package com.pattern.decorator;

import com.pattern.decorator.oa.Table;
import com.pattern.decorator.oa.decorator.D1;
import com.pattern.decorator.oa.decorator.D2;
import com.pattern.decorator.oa.decorator.Decorator;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 16:54
 */
public class Main {
	public static void main (String[] args) {
		Table table = new Table("decorator design pattern");
		Decorator decorator = new D1(table);
		table = decorator.addHeader().addTail().getTable();
		System.out.println(table);
		
		decorator = new D2(table);
		table = decorator.addHeader().addTail().getTable();
		System.out.println(table);
	}
}
