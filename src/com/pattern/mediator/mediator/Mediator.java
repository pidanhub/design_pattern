package com.pattern.mediator.mediator;

import com.pattern.mediator.system.SubSystem;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:50
 */
@FunctionalInterface
public interface Mediator {
	
	void share (String message, SubSystem system);
}
