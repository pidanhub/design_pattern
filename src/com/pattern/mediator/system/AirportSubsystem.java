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
	
	private AirportSubsystem () {
	}
	
	public static AirportSubsystem getInstance () {
		airportSubsystem.messageSet = new HashSet<>();
		airportSubsystem.mediator = new MediatorImpl();
		return airportSubsystem;
	}
}
