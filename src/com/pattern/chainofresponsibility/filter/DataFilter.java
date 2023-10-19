package com.pattern.chainofresponsibility.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 18:08
 */
public abstract class DataFilter {
	
	protected DataFilter nextFilter = null;
	
	public DataFilter setNext (DataFilter dataFilter) {
		nextFilter = dataFilter;
		return dataFilter;
	}
	
	// 过滤
	public abstract <T> T filtrate (Object o);
	
	protected boolean hasNext () {
		return !(nextFilter == null || nextFilter == this);
	}
}
