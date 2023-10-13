package com.pattern.singleton.iodh;

/*
 * @Author Zzs
 * @Description IoDH，是两全的做法
 * @DateTime 2023/10/12 23:21
 */
public class VirtualUserGenerator {
	
	static {
		System.out.println("VUG is loaded.");
	}
	
	private int userCount = 0;
	
	private VirtualUserGenerator () {
		System.out.println("Singleton instance created.");
	}
	
	public static VirtualUserGenerator getInstance () {
		return VirtualUserGeneratorHolder.INSTANCE;
	}
	
	public int getUserCount () {
		return userCount;
	}
	
	public void addUserCount () {
		this.userCount++;
	}
	
	private static class VirtualUserGeneratorHolder {
		private static final VirtualUserGenerator INSTANCE = new VirtualUserGenerator();
		
		static {
			System.out.println("holder is loaded.");
		}
	}
}

