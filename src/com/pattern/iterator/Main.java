package com.pattern.iterator;

import com.pattern.iterator.customer.Element;
import com.pattern.iterator.customer.ElementList;
import com.pattern.iterator.framework.Iterator;

import java.util.Arrays;

/*
 * @Author Zzs
 * @Description 设计一个逐页迭代器，每次可返回指定个数（一页）元素，并将该迭代器用于对数据进行分页处理。绘制对应的类图并编程模拟实现。
 * @DateTime 2023/10/12 13:26
 */
public class Main {
	public static void main (String[] args) {
		ElementList elementList = new ElementList();
		for (int i = 0; i < 5; i++) {
			elementList.put(new Element());
		}
		
		Iterator<Element> iterator = elementList.iterator();
		while (iterator.hasNext())
			System.out.println(Arrays.toString(iterator.next()));
		
		System.out.println("---------------------");
		
		for (int i = 0; i < 17; i++) {
			elementList.put(new Element());
		}
		
		Iterator<Element> it = elementList.iterator().limit(6);
		while (it.hasNext()) {
			System.out.println(Arrays.toString(it.next()));
		}
	}
}
