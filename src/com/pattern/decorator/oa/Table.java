package com.pattern.decorator.oa;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 16:55
 */
public class Table {
	protected int nextDecorateLength;
	private String context;
	
	public Table (String context) {
		this.context = context;
		nextDecorateLength = context.length();
	}
	
	public Table () {
	}
	
	public int getNextDecorateLength () {
		return nextDecorateLength;
	}
	
	public void setNextDecorateLength () {
		this.nextDecorateLength += 2;
	}
	
	public String getContext () {
		return context;
	}
	
	public void decorator (String result) {
		context = result;
	}
	
	@Override
	public String toString () {
		return context;
	}
}
