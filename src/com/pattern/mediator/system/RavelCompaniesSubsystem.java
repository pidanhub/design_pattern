package com.pattern.mediator.system;

import com.pattern.mediator.mediator.MediatorImpl;

import java.util.HashSet;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 21:53
 */
public class RavelCompaniesSubsystem extends SubSystem {
	private static final RavelCompaniesSubsystem ravelCompaniesSubsystem = new RavelCompaniesSubsystem();
	
	static {
		ravelCompaniesSubsystem.messageSet = new HashSet<>();
		ravelCompaniesSubsystem.mediator = new MediatorImpl();
	}
	
	private RavelCompaniesSubsystem () {
	}
	
	public static RavelCompaniesSubsystem getInstance () {
		return ravelCompaniesSubsystem;
	}
}
