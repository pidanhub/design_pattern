package com.pattern.observer.app.observer.impl;

import com.pattern.observer.app.observer.Observer;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 11:50
 */
public class WordsListObserver extends Observer {
	public WordsListObserver (TextArea area) {
		super(area);
	}
	
	@Override
	public void observe () {
		String text = area.getText();
		String[] words = text.equals("") ? null : text.split(" ");
		if (words == null)
			setLabel("暂未编辑文本");
		else {
			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].replaceAll("[^a-zA-Z]", "");
			}

//			Set<String> wordsSet = new TreeSet<>((o1, o2) -> {
//				return o1.substring(0, 2).toLowerCase().compareTo(o2.substring(0, 2).toLowerCase());
//			});
			// 上面与下面等价
			Set<String> wordsSet = new TreeSet<>(Comparator.comparing(o -> o.substring(0, 2).toLowerCase()));
			wordsSet.addAll(Arrays.asList(words));
			setLabel(wordsSet.toString());
		}
		
	}
	
}
