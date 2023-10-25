package com.pattern.observer.app.observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 0:29
 */
public abstract class Observer extends Button implements ActionListener {
	
	protected final TextArea area;
	
	public Observer (TextArea area) {
		this.area = area;
		// 注册自己这个按钮信息，按下即可统计
		addActionListener(this);
		observe();
	}
	
	public abstract void observe ();
	
	@Override
	public void actionPerformed (ActionEvent e) {
		observe();
	}
}
