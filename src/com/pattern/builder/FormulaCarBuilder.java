package com.pattern.builder;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/13 23:57
 */
public class FormulaCarBuilder extends Builder {
	@Override
	protected Builder buildBody () {
		car.setBody("方程式车车身");
		return this;
	}
	
	@Override
	protected Builder buildEngine () {
		car.setEngine("方程式车发动机");
		return this;
	}
	
	@Override
	protected Builder buildTires () {
		car.setTires("方程式车轮胎");
		return this;
	}
	
	@Override
	protected Builder buildGearbox () {
		car.setGearbox("方程式车变速箱");
		return this;
	}
}
