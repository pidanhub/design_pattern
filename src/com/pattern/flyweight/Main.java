package com.pattern.flyweight;

import com.pattern.flyweight.oa.Permission;
import com.pattern.flyweight.oa.PermissionFactory;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 14:41
 */
public class Main {
	public static void main (String[] args) {
		PermissionFactory permissionFactory = new PermissionFactory();
		
		// 用户权限编码集合
		String[] userPermissions = { "read", "write", "read", "execute" };
		
		// 构建用户权限列表
		for (String permissionCode : userPermissions) {
			Permission permission = permissionFactory.getPermission(permissionCode);
			System.out.println("User has permission: " + permission.getPermissionCode());
		}
	}
}
