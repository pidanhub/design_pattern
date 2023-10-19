package com.pattern.bridge.app.format;

/*
 * @Author Zzs
 * @Description 这个最终决定也是设计成抽象类更好
 *              因为图片格式也是一种抽象，滤镜也是一种抽象，他们之间（各个格式、各个滤镜}之间可能有相同的行为和属性，是一种抽象。
 * @DateTime 2023/10/19 0:04
 */
public abstract class ImageFormat {
	
	public abstract Object parse ();
}
