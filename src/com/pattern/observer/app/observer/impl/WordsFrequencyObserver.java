package com.pattern.observer.app.observer.impl;

import com.pattern.observer.app.observer.Observer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 13:12
 */
public class WordsFrequencyObserver extends Observer {
	public WordsFrequencyObserver (TextArea area) {
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
			Map<String, Integer> wordsMap = new TreeMap<>();
			for (String word : words) {
				wordsMap.merge(word, 1, (Integer oldV, Integer newV) -> ++oldV);
			}
			List<Map.Entry<String, Integer>> worldsList = new ArrayList<>(wordsMap.entrySet());
			worldsList.sort(((o1, o2) -> o2.getValue().compareTo(o1.getValue())));
			setLabel(wordsMap.toString());
		}
		
	}
}
