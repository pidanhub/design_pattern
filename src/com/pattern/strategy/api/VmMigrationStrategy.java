package com.pattern.strategy.api;

import java.util.HashMap;
import java.util.Map;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/18 17:42
 */
public class VmMigrationStrategy {
	
	private final Map<String, VmMigrationAlgorithm> strategies;
	
	public VmMigrationStrategy () {
		strategies = new HashMap<>();
		strategies.put("pre", new PreCopyAlgorithm());
		strategies.put("post", new PostCopyAlgorithm());
	}
	
	public boolean registerCustomAlgorithm (String name, VmMigrationAlgorithm vmMigrationAlgorithm) {
		if (vmMigrationAlgorithm == null)
			throw new NullPointerException();
		strategies.put(name, vmMigrationAlgorithm);
		return strategies.containsKey(name) && strategies.get(name) != null;
	}
	
	public void start (String name) {
		if (!strategies.containsKey(name)) {
			System.out.println("No this algorithm.");
			return;
		}
		
		strategies.get(name).algorithm();
	}
	
}
