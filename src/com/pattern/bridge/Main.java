package com.pattern.bridge;

import com.pattern.bridge.app.Photo;
import com.pattern.bridge.app.filter.BlurFilter;
import com.pattern.bridge.app.filter.Filter;
import com.pattern.bridge.app.filter.SharpenFilter;
import com.pattern.bridge.app.format.ImageFormat;
import com.pattern.bridge.app.format.JPGFormat;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/18 23:11
 */
public class Main {
	public static void main (String[] args) {
		// 现在一个client拍摄了一张照片，保存格式为jpg
		Photo p = new Photo(new JPGFormat());
		// 没有加滤镜
		p.beautification();
		// 用户觉得不好看，从滤镜列表里选择了一个滤镜加上去了，并且美化了一下看看效果
		p.addOrChangeFilter(new SharpenFilter());
		p.beautification();
		// 再次更换滤镜
		p.addOrChangeFilter(new BlurFilter());
		p.beautification();
		// 拓展新支持的格式，新增更多好玩的滤镜...
		Photo photo = new Photo(
				new ImageFormat() {
					// .bpm
					@Override
					public Object parse () {
						return null;
					}
				},
				new Filter() {
					@Override
					public void beautification () {
						System.out.println("校园风光滤镜");
					}
				}
		);
		photo.beautification();
	}
}
