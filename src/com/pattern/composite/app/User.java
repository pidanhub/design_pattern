package com.pattern.composite.app;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 15:25
 */
public class User extends Memberable {
	
	private final String id = "u_" + super.id;
	
	@Override
	public String getId () {
		return this.id;
	}
	
	public void share (Object o, Memberable member) {
		member.message = o;
		member.accept(o);
	}
	
	// 接收消息，用户和群组都可以接收
	public void accept (Object o) {
		System.out.println(message);
	}
	
	@Override
	public void print () {
		System.out.println(message);
	}
}
