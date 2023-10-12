package com.pattern.singleton.hungry;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 23:08
 */
public class Main {
	
	public static void main (String[] args) {
		for (int i = 0; i < 10; i++) {
			VirtualUserGenerator instance = VirtualUserGenerator.getInstance();
			System.out.println(instance);
			instance.setUserCount();
		}
		System.out.println(VirtualUserGenerator.getInstance().getUserCount());
		/*
		output:
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			com.pattern.singleton.hungry.VirtualUserGenerator@4554617c
			10
		 */
	}
}
