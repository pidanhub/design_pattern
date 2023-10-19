package com.pattern.decorator.oa.decorator;

import com.pattern.decorator.oa.Table;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 16:56
 */
public class D2 extends Decorator {
	
	public D2 (Table table) {
		super(table);
	}
	
	@Override
	public Decorator addHeader () {
		StringBuilder header = new StringBuilder();
		for (int i = 0; i < table.getNextDecorateLength(); i++) {
			header.append("*");
		}
		header.append("\n");
		table.decorator(header + table.getContext());
		return this;
	}
	
	@Override
	public Decorator addTail () {
		StringBuilder tail = new StringBuilder().append("\n");
		for (int i = 0; i < table.getNextDecorateLength(); i++) {
			tail.append("/");
		}
		table.decorator(table.getContext() + tail);
		return this;
	}
}
