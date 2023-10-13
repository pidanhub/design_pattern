package com.pattern.builder;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:59
 */
public class Car {
	
	protected String tires;
	protected String gearbox;
	/*
		实际上还可以将车身、发动机等零件另创建类
		然后在各个builder中针对不同种的零件进行属性赋值，方法调用等
		由于只是一个演示demo，故用字符串代替
	 */
	private String body;
	private String engine;
	
	@Override
	public String toString () {
		return "Car{" +
				"body='" + body + '\'' +
				", engine='" + engine + '\'' +
				", tires='" + tires + '\'' +
				", gearbox='" + gearbox + '\'' +
				'}';
	}
	
	public void setBody (String body) {
		this.body = body;
	}
	
	public void setEngine (String engine) {
		this.engine = engine;
	}
	
	public void setTires (String tires) {
		this.tires = tires;
	}
	
	public void setGearbox (String gearbox) {
		this.gearbox = gearbox;
	}
	
}
