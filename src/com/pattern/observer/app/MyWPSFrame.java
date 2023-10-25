package com.pattern.observer.app;

import com.pattern.observer.app.observer.Observer;
import com.pattern.observer.app.observer.impl.WordsCountObserver;
import com.pattern.observer.app.observer.impl.WordsFrequencyObserver;
import com.pattern.observer.app.observer.impl.WordsListObserver;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @Author Zzs
 * @Description 这个是界面类，里面会聚合三个观察者。
 * @DateTime 2023/10/25 0:23
 */
public class MyWPSFrame extends Frame {
	
	private final List<Observer> observers;
	private final TextArea textArea;
	
	public MyWPSFrame () {
		setTitle("WPS Office");
		setBounds(100, 100, 888, 666);
		setVisible(true);
		observers = new ArrayList<>();
		textArea = new TextArea();
		textArea.setFont(new Font("Serif", Font.PLAIN, 20));
		textArea.addKeyListener(new SaveEventListener());
		initFrame();
	}
	
	private void initFrame () {
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		});
		// 取消布局，改为自定义布局
		setLayout(null);
		// 加入文本框并设置大小和布局
		add(textArea);
		textArea.setBounds(20, 40, 860, 200);
		// 观察者的布局
		Observer wordsCountObserver = new WordsCountObserver(textArea);
		wordsCountObserver.setBounds(40, 220, 800, 100);
		
		Observer wordsListObserver = new WordsListObserver(textArea);
		wordsListObserver.setBounds(40, 330, 800, 100);
		
		Observer wordsFrequencyObserver = new WordsFrequencyObserver(textArea);
		wordsFrequencyObserver.setBounds(40, 440, 800, 100);
		
		add(wordsCountObserver);
		add(wordsListObserver);
		add(wordsFrequencyObserver);
		observers.addAll(Arrays.asList(wordsCountObserver, wordsListObserver, wordsFrequencyObserver));
	}
	
	private class SaveEventListener extends KeyAdapter {
		@Override
		public void keyReleased (KeyEvent e) {
			if (e.getModifiers() == InputEvent.CTRL_MASK && e.getKeyCode() == KeyEvent.VK_S) {
				for (Observer observer : observers) {
					observer.observe();
				}
			}
		}
	}
}
