package com.pattern.command.remotecontrol.command;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/25 22:24
 */
public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand (Light light) {
		this.light = light;
	}
	
	public void setLight (Light light) {
		this.light = light;
	}
	
	@Override
	public void execute () {
		light.off();
	}
}
