package com.pattern.chainofresponsibility.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 18:19
 */
public class IntToBinaryFilter extends DataFilter {
	
	@Override
	@SuppressWarnings ("unchecked")
	public <T> T filtrate (Object o) {
		StringBuilder result = new StringBuilder();
		int i = (int) o;
		while (i != 0) {
			result.append(i % 2);
			i /= 2;
		}
		result.reverse();
		return hasNext() ? nextFilter.filtrate(result.toString()) : (T) result.toString();
	}
}
