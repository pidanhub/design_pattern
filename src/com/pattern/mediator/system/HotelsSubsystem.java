package com.pattern.mediator.system;

import com.pattern.mediator.mediator.MediatorImpl;

import java.util.HashSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:54
 */
public class HotelsSubsystem extends SubSystem {
	private static final HotelsSubsystem hotelsSubsystem = new HotelsSubsystem();
	
	static {
		hotelsSubsystem.messageSet = new HashSet<>();
		hotelsSubsystem.mediator = new MediatorImpl();
	}
	
	private HotelsSubsystem () {
	}
	
	public static HotelsSubsystem getInstance () {
		return hotelsSubsystem;
	}
}
