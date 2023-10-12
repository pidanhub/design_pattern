package com.pattern.adapter.customer.oa;

/*
 * @Author Zzs
 * @Description 这是我们系统中的加密算法，比如对应某些算法进行一些再加密操作
 * @DateTime 2023/10/12 19:45
 */
public interface SystemEncoder {
	
	String strongerMD5 (String input);
	
	String strongerBASE64 (String input);
	
}
