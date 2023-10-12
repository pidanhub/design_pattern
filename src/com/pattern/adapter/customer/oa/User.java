package com.pattern.adapter.customer.oa;

/*
 * @Author Zzs
 * @Description 用户信息，从数据库中存取，省略数据库存取操作（题目中说系统已经提供）
 * @DateTime 2023/10/12 19:25
 */
public class User {
	
	private String name;
	private String password;
	private String token;
	
	private User (Builder builder) {
		name = builder.name;
		password = builder.password;
		token = builder.token;
	}
	
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getPassword () {
		return password;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public String getToken () {
		return token;
	}
	
	public void setToken (String token) {
		this.token = token;
	}
	
	@Override
	public String toString () {
		return "User{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", token='" + token + '\'' +
				'}';
	}
	
	public static final class Builder {
		private String name;
		private String password;
		private String token;
		
		private Builder () {
		}
		
		public static Builder builder () {
			return new Builder();
		}
		
		public Builder name (String name) {
			this.name = name;
			return this;
		}
		
		public Builder password (String password) {
			this.password = password;
			return this;
		}
		
		public Builder token (String token) {
			this.token = token;
			return this;
		}
		
		public User build () {
			return new User(this);
		}
	}
}
