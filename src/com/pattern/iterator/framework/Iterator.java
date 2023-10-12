package com.pattern.iterator.framework;

/*
 * @Author Zzs
 * @Description 通用迭代器
 * @DateTime 2023/10/12 13:29
 */
public interface Iterator<T> {
	
	boolean hasNext ();
	
	T[] next ();
	
	// 提供设置分页limit的方法，如果用户需要分页，可以增加属性并实现这个方法，如果实现接口的程序员不需要，则忽略这个方法
	default Iterator<T> limit (int quantity) {
		return null;
	}
	
}
