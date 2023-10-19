package com.pattern.chainofresponsibility.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 20:15
 */
public class StartFilter extends DataFilter {
	@Override
	@SuppressWarnings ("unchecked")
	public <T> T filtrate (Object o) {
		return hasNext() ? nextFilter.filtrate(o) : (T) o;
	}
}
