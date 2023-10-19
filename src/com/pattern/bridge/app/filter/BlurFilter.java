package com.pattern.bridge.app.filter;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 0:11
 */
public class BlurFilter extends Filter {
	
	@Override
	public void beautification () {
		System.out.println("模糊滤镜加在图片上了");
	}
}
