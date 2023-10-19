package com.pattern.bridge.app.filter;

import com.pattern.bridge.app.format.ImageFormat;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 10:59
 */
public abstract class Filter {
	
	protected ImageFormat imageFormatParser;
	
	public Filter setImageFormatParser (ImageFormat imageFormatParser) {
		this.imageFormatParser = imageFormatParser;
		return this;
	}
	
	// 美化
	public abstract void beautification ();
}
