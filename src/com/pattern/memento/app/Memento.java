package com.pattern.memento.app;

import java.util.Stack;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 22:37
 */
public class Memento {
	private static final Memento memento = new Memento();
	private final Stack<String> undoList = new Stack<>();
	private final Stack<String> redoList = new Stack<>();
	
	private Memento () {
	}
	
	public static Memento getInstance () {
		return memento;
	}
	
	void createMemento (String string) {
		undoList.push(string);
	}
	
	String undo (String now) {
		String text = undoList.pop();
		redoList.push(now);
		return text;
	}
	
	String redo (String now) {
		if (redoList.empty())
			return null;
		undoList.push(now);
		return redoList.pop();
	}
	
	boolean testUndo () {
		return undoList.isEmpty();
	}
	
	boolean testRedo () {
		return redoList.isEmpty();
	}
}
