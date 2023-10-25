package com.pattern.cacheproxy;

import com.pattern.cacheproxy.system.QueryProxy;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 21:20
 */
public class Main {
	public static void main (String[] args) {
		String s1 = "query 1";
		String s2 = "query 2";
		String s3 = "query 3";
		
		QueryProxy queryProxy = QueryProxy.getInstance();
		Double d1 = queryProxy.queryProxy(s1);
		Double d2 = queryProxy.queryProxy(s2);
		Double d3 = queryProxy.queryProxy(s3);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println("第二次查询");
		Double d11 = queryProxy.queryProxy(s1);
		Double d22 = queryProxy.queryProxy(s2);
		Double d33 = queryProxy.queryProxy(s3);
		System.out.println(d11);
		System.out.println(d22);
		System.out.println(d33);
	}
}
