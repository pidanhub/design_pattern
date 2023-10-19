package com.pattern.mediator.system;

import com.pattern.mediator.mediator.MediatorImpl;

import java.util.HashSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:55
 */
public class TourismAttractionsSubsystem extends SubSystem {
	private static final TourismAttractionsSubsystem tourismAttractionsSubsystem = new TourismAttractionsSubsystem();
	
	private TourismAttractionsSubsystem () {
	}
	
	public static TourismAttractionsSubsystem getInstance () {
		tourismAttractionsSubsystem.messageSet = new HashSet<>();
		tourismAttractionsSubsystem.mediator = new MediatorImpl();
		return tourismAttractionsSubsystem;
	}
}
