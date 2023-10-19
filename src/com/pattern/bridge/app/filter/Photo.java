package com.pattern.bridge.app.filter;

import com.pattern.bridge.app.format.ImageFormat;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 0:08
 */
public class Photo {
	
	protected ImageFormat imageFormat;
	
	// 照片默认是不加滤镜的
	private Filter filter;
	
	public Photo (ImageFormat imageFormat) {
		this.imageFormat = imageFormat;
		// 默认无滤镜
		filter = new Filter() {
			@Override
			public void beautification () {
				System.out.println("无滤镜");
			}
		};
	}
	
	public Photo (ImageFormat imageFormat, Filter filter) {
		this.imageFormat = imageFormat;
		this.filter = filter.setImageFormatParser(imageFormat);
	}
	
	public void addOrChangeFilter (Filter filter) {
		// 后添加一个滤镜，或者更换滤镜
		this.filter = filter;
	}
	
	public void beautification () {
		filter.beautification();
	}
}
