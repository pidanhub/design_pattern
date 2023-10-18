package com.pattern.strategy;

import com.pattern.strategy.api.VmMigrationStrategy;

import java.util.Scanner;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/18 17:39
 */
public class Main {
	public static void main (String[] args) {
		System.out.println("选择你需要的算法");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		VmMigrationStrategy vmMigrationStrategy = new VmMigrationStrategy();
		vmMigrationStrategy.start(name);
		
		if (vmMigrationStrategy.registerCustomAlgorithm("my", () -> System.out.println("my algorithm."))) {
			vmMigrationStrategy.start("my");
		}
		
	}
}
