package com.pattern.chainofresponsibility.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 18:30
 */
public class BinaryToByteArrayFilter extends DataFilter {
	@Override
	public <T> T filtrate (Object o) {
		if (!((String) o).replaceAll("[01]", "").equals(""))
			throw new IllegalArgumentException();
		String s = (String) o;
		byte[] bytes = new byte[s.length()];
		for (int i = 0; i < s.length(); i++) {
			bytes[i] = Byte.parseByte(String.valueOf(s.charAt(i)));
		}
		return hasNext() ? nextFilter.filtrate(bytes) : (T) bytes;
	}
}
