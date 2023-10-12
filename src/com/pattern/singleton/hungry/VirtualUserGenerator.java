package com.pattern.singleton.hungry;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 23:21
 */
public class VirtualUserGenerator {
	private static final VirtualUserGenerator virtualUserGenerator = new VirtualUserGenerator();
	private int userCount = 0;
	
	private VirtualUserGenerator () {
	}
	
	public static VirtualUserGenerator getInstance () {
		return virtualUserGenerator;
	}
	
	public int getUserCount () {
		return userCount;
	}
	
	public void setUserCount () {
		this.userCount++;
	}
	
	
}
