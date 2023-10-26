package com.pattern.memento.app;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
 * @Author Zzs
 * @Description 这个是界面类，里面会聚合三个观察者。
 * @DateTime 2023/10/25 0:23
 */
public class MyWPSFrame extends Frame {
	private final TextArea textArea;
	private final Memento memento = Memento.getInstance();
	public MyWPSFrame () {
		setTitle("WPS Office");
		setBounds(100, 100, 888, 500);
		setVisible(true);
		textArea = new TextArea();
		textArea.setFont(new Font("Serif", Font.PLAIN, 30));
		initFrame();
	}
	
	private void initFrame () {
		setLayout(null);
		addWindowListener(new WindowAdapter() {
			public void windowClosing (WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(textArea);
		textArea.setBounds(20, 40, 860, 200);
		Button record = new Button("record");
		record.setBounds(120, 300, 100, 50);
		Button undo = new Button("undo");
		undo.setBounds(320, 300, 100, 50);
		undo.setEnabled(false);
		Button redo = new Button("redo");
		redo.setBounds(540, 300, 100, 50);
		redo.setEnabled(false);
		add(record);
		add(undo);
		add(redo);
		
		record.addActionListener((ActionEvent e) -> {
			memento.createMemento(textArea.getText());
			// 添加了备忘录以后就可以执行撤销操作
			if (!undo.isEnabled())
				undo.setEnabled(true);
		});
		
		undo.addActionListener((ActionEvent e) -> {
			textArea.setText(memento.undo(textArea.getText()));
			if (memento.testUndo())
				undo.setEnabled(false);
			if (!redo.isEnabled())
				redo.setEnabled(true);
		});
		
		redo.addActionListener((ActionEvent e) -> {
			textArea.setText(memento.redo(textArea.getText()));
			if (memento.testRedo())
				redo.setEnabled(false);
			if (!undo.isEnabled())
				undo.setEnabled(true);
		});
	}
	
}
