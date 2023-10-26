package com.pattern.flyweight.oa;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 20:47
 */
public class Permission {
	private final String permissionCode;
	
	public Permission (String permissionCode) {
		this.permissionCode = permissionCode;
	}
	
	public String getPermissionCode () {
		return permissionCode;
	}
}