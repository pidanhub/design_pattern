package com.pattern.singleton.iodh;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 23:08
 */
public class Main {
	static {
		System.out.println("main is loaded.");
	}
	
	public static void main (String[] args) {
		System.out.println("program is running.");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		Thread[] threads = new VUGThread[10];
		for (int i = 0; i < 10; ++i) {
			threads[i] = new VUGThread();
			threads[i].start();
		}
	}
	
	private static class VUGThread extends Thread {
		static {
			System.out.println("thread is loaded.");
		}
		
		@Override
		public void run () {
			VirtualUserGenerator virtualUserGenerator = VirtualUserGenerator.getInstance();
			System.out.println(virtualUserGenerator);
		}
	}
}
