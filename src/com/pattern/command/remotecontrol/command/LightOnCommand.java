package com.pattern.command.remotecontrol.command;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 22:24
 */
public class LightOnCommand implements Command {
	private Light light;
	
	public LightOnCommand (Light light) {
		this.light = light;
	}
	
	public void setLight (Light light) {
		this.light = light;
	}
	
	@Override
	public void execute () {
		// 通过命令调用灯具的开关
		light.on();
	}
}
