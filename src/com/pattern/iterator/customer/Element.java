package com.pattern.iterator.customer;

/*
 * @Author Zzs
 * @Description 将要迭代的数据，可以是数据库中的一个元组，也可以是其他数据
 *              本例为突出设计模式的作用，仅将元素生成一个随机数作为一个元素
 * @DateTime 2023/10/12 13:34
 */
public class Element {
	
	private final int element;
	
	public Element () {
		element = (int) (Math.random() * 100);
	}
	
	public int getElement () {
		return element;
	}
	
	@Override
	public String toString () {
		return "Element{" +
				"element=" + element +
				'}';
	}
}
