package com.pattern.singleton.synchronize;

/*
 * @Author Zzs
 * @Description 懒汉式单例，节省资源，但是会造成线程不安全的后果，所以使用了双重检查锁Double-Checked Locking的方式，但是其实也会造成另一种浪费资源的情况
 * @DateTime 2023/10/12 23:21
 */
public class VirtualUserGenerator {
	
	private static volatile VirtualUserGenerator virtualUserGenerator;
	private int userCount = 0;
	
	private VirtualUserGenerator () {
	}
	
	public static VirtualUserGenerator getInstance () {
		if (virtualUserGenerator == null) {
			synchronized (VirtualUserGenerator.class) {
				if (virtualUserGenerator == null) {
					virtualUserGenerator = new VirtualUserGenerator();
				}
			}
			return virtualUserGenerator;
		}
		return virtualUserGenerator;
	}
	
	public int getUserCount () {
		return userCount;
	}
	
	public void addUserCount () {
		this.userCount++;
	}
	
}
