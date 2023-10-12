package com.pattern.iterator.customer;

import com.pattern.iterator.framework.Iterator;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 18:53
 */
public class ElementIterator implements Iterator<Element> {
	
	private final ElementList elementList;
	private int index;
	private int limit;
	
	public ElementIterator (ElementList elementList) {
		this.elementList = elementList;
		index = 0;
		limit = 1;
	}
	
	@Override
	public boolean hasNext () {
		return index < elementList.length();
	}
	
	@Override
	public Element[] next () {
		if (limit == 1)
			return new Element[]{ elementList.get(index++) };
		else {
			Element[] elements = new Element[limit];
			for (int i = 0; i < limit && hasNext(); i++, index++) {
				elements[i] = elementList.get(index);
			}
			return elements;
		}
	}
	
	@Override
	public Iterator<Element> limit (int quantity) {
		if (quantity <= 0)
			throw new IllegalArgumentException("Bad value of limit, at least 1");
		limit = quantity;
		return this;
	}
}
