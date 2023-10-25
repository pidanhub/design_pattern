package com.pattern.observer.app.observer.impl;

import com.pattern.observer.app.observer.Observer;

import java.awt.*;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 0:58
 */
public class WordsCountObserver extends Observer {
	
	public WordsCountObserver (TextArea area) {
		super(area);
	}
	
	@Override
	public void observe () {
		String text = area.getText();
		int words = text.equals("") ? 0 : text.split(" ").length;
		int chars = text.length();
		// 中文乱码，需要配置编译器选项
		String name = "编辑文本区中出现的单词总数量和字符总数量:\n"
				+ " words: " + words
				+ "\t chars: " + chars + "\n";
		setLabel(name);
	}
}
