package com.pattern.decorator.oa.decorator;

import com.pattern.decorator.oa.Table;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 16:55
 */
public abstract class Decorator {
	protected Table table;
	
	public Decorator (Table table) {
		this.table = table;
	}
	
	public abstract Decorator addHeader ();
	
	public abstract Decorator addTail ();
	
	public Table getTable () {
		table.setNextDecorateLength();
		return table;
	}
}
