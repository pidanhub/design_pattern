package com.pattern.command.remotecontrol;

import com.pattern.command.remotecontrol.command.Command;

/*
 * @Author Zzs
 * @Description 遥控器
 * @DateTime 2023/10/25 22:20
 */
public class RC {
	private final Command[] commands;
	
	public RC () {
		commands = new Command[10];
		Command command = () -> {
			// no...
		};
		for (int i = 0; i < 10; i++) {
			commands[i] = command;
		}
	}
	
	public void setCommand (int slot, Command onCommand, Command offCommand) {
		commands[slot] = onCommand;
		commands[slot + 5] = offCommand;
	}
	
	public void turnOnLight (int slot) {
		commands[slot].execute();
	}
	
	public void turnOffLight (int slot) {
		commands[slot + 5].execute();
	}
}
