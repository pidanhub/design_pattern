package com.pattern.adapter.customer.oa;

/*
 * @Author Zzs
 * @Description 简易版的存取数据库操作
 * @DateTime 2023/10/12 19:28
 */
public class DB {
	public static User getUser () {
		System.out.println("-----从数据库中获取一个用户信息-----\n-----分别输入用户名、密码、令牌，换行隔开-----");
		User user = User.Builder.builder()
				.name("张三")
				.password("123456")
				.token("apache")
				.build();
		System.out.println("===用户信息预览：" + user + "===");
		return user;
	}
	
	public static void saveUser (User user) {
		System.out.println("-----向数据库中存储一个用户信息-----");
		System.out.println(user);
		System.out.println("=====写入数据库完成=====");
	}
}
