package com.pattern.flyweight.oa;

import java.util.HashMap;
import java.util.Map;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 20:47
 */
public class PermissionFactory {
	private final Map<String, Permission> permissionPool;
	
	public PermissionFactory () {
		permissionPool = new HashMap<>();
	}
	
	public Permission getPermission (String permissionCode) {
		Permission permission = permissionPool.get(permissionCode);
		if (permission == null) {
			permission = new Permission(permissionCode);
			permissionPool.put(permissionCode, permission);
		}
		return permission;
	}
}