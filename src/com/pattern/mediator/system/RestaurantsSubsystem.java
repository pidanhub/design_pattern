package com.pattern.mediator.system;

import com.pattern.mediator.mediator.MediatorImpl;

import java.util.HashSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:54
 */
public class RestaurantsSubsystem extends SubSystem {
	private static final RestaurantsSubsystem restaurantsSubsystem = new RestaurantsSubsystem();
	
	private RestaurantsSubsystem () {
	}
	
	public static RestaurantsSubsystem getInstance () {
		restaurantsSubsystem.messageSet = new HashSet<>();
		restaurantsSubsystem.mediator = new MediatorImpl();
		return restaurantsSubsystem;
	}
}
