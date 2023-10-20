package com.pattern.chainofresponsibility.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 18:19
 */
public class FloatToIntFilter extends DataFilter {
	@SuppressWarnings ("unchecked")
	@Override
	public <T> T filtrate (Object o) {
		if (!(o instanceof Float))
			throw new IllegalArgumentException();
		int i = (int) (float) o;
		return hasNext() ? nextFilter.filtrate(i) : (T) (Integer) i;
	}
}
