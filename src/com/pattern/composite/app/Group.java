package com.pattern.composite.app;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 15:28
 */
public class Group extends Memberable {
	
	private final String id = "g_" + super.id;
	private final List<Memberable> list = new ArrayList<>();
	
	@Override
	public String getId () {
		return this.id;
	}
	
	@Override
	public void accept (Object o) {
		for (Memberable member : list) {
			if (member instanceof User)
				member.message = o;
			else if (member instanceof Group)
				member.accept(o);
		}
	}
	
	public void passApply (Memberable member) {
		list.add(member);
	}
	
	@Override
	public void print () {
		for (Memberable member : list) {
			if (member instanceof User)
				System.out.println(member.message);
			else if (member instanceof Group)
				member.print();
		}
	}
}
