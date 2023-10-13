package com.pattern.builder;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:57
 */
public class OffRoadCarBuilder extends Builder {
	@Override
	protected Builder buildBody () {
		car.setBody("场地越野赛车车身");
		return this;
	}
	
	@Override
	protected Builder buildEngine () {
		car.setEngine("场地越野赛车发动机");
		return this;
	}
	
	@Override
	protected Builder buildTires () {
		car.setTires("场地越野赛车轮胎");
		return this;
	}
	
	@Override
	protected Builder buildGearbox () {
		car.setGearbox("场地越野赛车变速箱");
		return this;
	}
}
