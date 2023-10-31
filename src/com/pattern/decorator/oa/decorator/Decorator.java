package com.pattern.decorator.oa.decorator;

import com.pattern.decorator.oa.Table;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 16:55
 */
public abstract class Decorator extends Table {
	protected Table table;
	
	public Decorator (Table table) {
		super();
		this.table = table;
	}
	
	public abstract Decorator addHeader ();
	
	public abstract Decorator addTail ();
	
	public Table getTable () {
		table.setNextDecorateLength();
		return table;
	}
}
