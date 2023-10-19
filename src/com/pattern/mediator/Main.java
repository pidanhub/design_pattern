package com.pattern.mediator;

import com.pattern.mediator.mediator.MediatorImpl;
import com.pattern.mediator.system.AirportSubsystem;
import com.pattern.mediator.system.RavelCompaniesSubsystem;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:49
 */
public class Main {
	public static void main (String[] args) {
		RavelCompaniesSubsystem ravelCompaniesSubsystem = RavelCompaniesSubsystem.getInstance();
		MediatorImpl.printAllSystemsMessageSet();
		// 旅行社子系统得到一条游客信息
		ravelCompaniesSubsystem.acceptMessage("zhang san");
		MediatorImpl.printAllSystemsMessageSet();
		
		AirportSubsystem airportSubsystem = AirportSubsystem.getInstance();
		airportSubsystem.acceptMessage("li si");
		MediatorImpl.printAllSystemsMessageSet();
	}
}
