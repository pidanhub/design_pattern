package com.pattern.iterator.customer;

import com.pattern.iterator.framework.Aggregate;
import com.pattern.iterator.framework.Iterator;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 13:37
 */
public class ElementList implements Aggregate<Element> {
	
	private final List<Element> elementList = new ArrayList<>();
	
	public void put (Element element) {
		elementList.add(element);
	}
	
	public Element get (int index) {
		return elementList.get(index);
	}
	
	public int length () {
		return elementList.size();
	}
	
	@Override
	public Iterator<Element> iterator () {
		return new ElementIterator(this);
	}
}
