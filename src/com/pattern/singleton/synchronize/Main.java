package com.pattern.singleton.synchronize;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 23:08
 */
public class Main {
	
	public static void main (String[] args) {
		Thread[] threads = new VUGThread[10];
		for (int i = 0; i < 10; ++i) {
			threads[i] = new VUGThread();
			threads[i].start();
		}
		
	}
	
	private static class VUGThread extends Thread {
		
		@Override
		public void run () {
			VirtualUserGenerator virtualUserGenerator = VirtualUserGenerator.getInstance();
			System.out.println(virtualUserGenerator);
		}
	}
	
}
