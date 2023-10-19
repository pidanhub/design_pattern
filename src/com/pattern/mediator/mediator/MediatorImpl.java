package com.pattern.mediator.mediator;

import com.pattern.mediator.system.*;

import java.util.HashSet;
import java.util.Set;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:50
 */
public class MediatorImpl implements Mediator {
	
	private static final Set<SubSystem> systemSet = new HashSet<>();
	
	static {
		// register
		systemSet.add(RavelCompaniesSubsystem.getInstance());
		systemSet.add(HotelsSubsystem.getInstance());
		systemSet.add(RestaurantsSubsystem.getInstance());
		systemSet.add(TourismAttractionsSubsystem.getInstance());
		systemSet.add(AirportSubsystem.getInstance());
	}
	
	public static void printAllSystemsMessageSet () {
		for (SubSystem system : systemSet) {
			System.out.println(system.getMessageSet());
		}
	}
	
	@Override
	public void share (String message, SubSystem system) {
		if (systemSet.contains(system)) {
			for (SubSystem others : systemSet) {
				if (others != system)
					others.mediatorShared(message);
			}
		}
	}
}
