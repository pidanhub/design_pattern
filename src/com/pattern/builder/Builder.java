package com.pattern.builder;

/*
 * @Author Zzs
 * @Description 在某赛车游戏中，赛车包括方程式赛车、场地越野赛车、运动汽车、卡车等类型，不同
				类型的赛车的车身、发动机、轮胎、变速箱等部件有所区别。玩家可以自行选择赛车类型，
				系统将根据玩家的选择创建出一辆完整的赛车。现采用建造者模式实现赛车的构建，绘制对
				应的类图并编程模拟实现。
 * @DateTime 2023/10/13 23:17
 */
public abstract class Builder {
	protected Car car;
	
	protected Builder build () {
		System.out.println("builder：开始闭门造一辆车");
		car = new Car();
		return this;
	}
	
	protected abstract Builder buildBody ();
	
	protected abstract Builder buildEngine ();
	
	protected abstract Builder buildTires ();
	
	protected abstract Builder buildGearbox ();
	
	protected void finish () {
		System.out.println("builder：现在是一辆完整的车了！");
	}
}
