package com.pattern.prototype.resume.template;

import java.io.Serializable;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/16 16:34
 */
public class Picture implements Serializable {
	public String change = "-";
	
	@Override
	public String toString () {
		return "Picture{" +
				"change='" + change + '\'' +
				'}';
	}
}
