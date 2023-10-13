package com.pattern.builder;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:20
 */
public class Director {
	
	private final Builder builder;
	
	public Director (Builder builder) {
		this.builder = builder;
	}
	
	/**
	 * @see Builder
	 */
	public Car makeCar () {
		// 这里一连串的操作不断在完善里面的car，builder在调用build的时候创建了car，然后组装各个组件，在最后会组装完成一辆车，然后返回给主函数
		builder.build()
				.buildBody()
				.buildEngine()
				.buildTires()
				.buildGearbox()
				.finish();
		return builder.car;
	}
}
