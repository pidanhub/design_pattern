package com.pattern.mediator.system;

import com.pattern.mediator.mediator.Mediator;

import java.util.Set;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:50
 */
public abstract class SubSystem {
	// 其他系统方法
	protected Set<String> messageSet;
	protected Mediator mediator;
	
	public void acceptMessage (String message) {
		messageSet.add(message);
		// 通知中介去广播
		mediator.share(message, this);
	}
	
	public String getMessageSet () {
		return messageSet.toString();
	}
	
	public void mediatorShared (String message) {
		messageSet.add(message);
	}
	
}
