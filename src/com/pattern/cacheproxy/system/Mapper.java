package com.pattern.cacheproxy.system;

import java.util.Random;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 21:22
 */
public enum Mapper {
	INSTANCE;
	
	public Double query () {
		return new Random().nextDouble() * 100;
	}
}
