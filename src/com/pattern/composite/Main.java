package com.pattern.composite;

import com.pattern.composite.app.Group;
import com.pattern.composite.app.User;

public class Main {
	public static void main (String[] args) {
		Group group1 = new Group();
		User user1 = new User();
		Group group2 = new Group();
		User user3 = new User();
		User user4 = new User();
		
		user3.joinIn(group2);
		user4.joinIn(group2);
		user1.joinIn(group1);
		group2.joinIn(group1);
		
		User user = new User();
		user.share("hello", group1);
		group1.print();
		System.out.println();
		user.share("world", group2);
		group1.print();
	}
}
