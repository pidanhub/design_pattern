package com.pattern.composite.app;

/*
 * @Author Zzs
 * @Description 可以成为群组内“成员”的最高层抽象
 * @DateTime 2023/10/19 15:15
 */
public abstract class Memberable {
	
	protected final Long id = System.currentTimeMillis();
	protected Object message;
	
	public abstract String getId ();
	
	// 申请加入一个群组，用户和群组都可以申请
	public void joinIn (Group group) {
		// 直接接受
		group.passApply(this);
	}
	
	// 接收消息，用户和群组都可以接收
	public abstract void accept (Object o);
	
	protected boolean isLegalId (String input) {
		return !(input == null || input.trim().equals("") || !input.startsWith("u_") || !input.startsWith("g_"));
	}
	
	public abstract void print ();
}
