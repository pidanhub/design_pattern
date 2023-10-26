package com.pattern.command;

import com.pattern.command.remotecontrol.RC;
import com.pattern.command.remotecontrol.command.Light;
import com.pattern.command.remotecontrol.command.LightOffCommand;
import com.pattern.command.remotecontrol.command.LightOnCommand;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 21:39
 */
public class Main {
	public static void main (String[] args) {
		RC remoteControl = new RC();
		Light livingRoomLight = new Light();
		Light kitchenLight = new Light();
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		
		remoteControl.turnOnLight(0);
		remoteControl.turnOffLight(0);
		remoteControl.turnOnLight(1);
		remoteControl.turnOffLight(1);
	}
}
