package com.pattern.mediator.system;

import com.pattern.mediator.mediator.MediatorImpl;

import java.util.HashSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:55
 */
public class AirportSubsystem extends SubSystem {
	private static final AirportSubsystem airportSubsystem = new AirportSubsystem();
	
	static {
		airportSubsystem.messageSet = new HashSet<>();
		airportSubsystem.mediator = new MediatorImpl();
	}
	
	private AirportSubsystem () {
	}
	
	public static AirportSubsystem getInstance () {
		return airportSubsystem;
	}
}
