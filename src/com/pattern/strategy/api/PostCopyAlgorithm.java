package com.pattern.strategy.api;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/18 17:40
 */
public class PostCopyAlgorithm implements VmMigrationAlgorithm {
	
	@Override
	public void algorithm () {
		System.out.println("后拷贝算法");
	}
}
