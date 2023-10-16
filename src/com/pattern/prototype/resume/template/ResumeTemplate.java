package com.pattern.prototype.resume.template;

import java.io.*;

/*
 * @Author Zzs
 * @Description 通过原型模式生成简历副本，创建简历的过程太过于复杂，从而每一次写简历的时候需要从其他已经写好的简历拷贝
 * @DateTime 2023/10/16 15:55
 */
public class ResumeTemplate implements Cloneable, Serializable {
	
	private final Picture picture;
	private String name;
	
	public ResumeTemplate () {
		picture = new Picture();
	}
	
	public ResumeTemplate (String name) {
		this.name = name;
		picture = new Picture();
	}
	
	@Override
	public String toString () {
		return "ResumeTemplate{" +
				"name='" + name + '\'' +
				", picture=" + picture +
				", picture.context='" + picture.change +
				"'}";
	}
	
	public void changePhoto (String token) {
		this.picture.change = picture.change + token;
	}
	
	@Override
	public ResumeTemplate clone () throws CloneNotSupportedException {
		return (ResumeTemplate) super.clone();
	}
	
	public ResumeTemplate getClone (boolean isDeep) {
		try {
			return isDeep ? deepClone() : shallowClone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private ResumeTemplate shallowClone () throws CloneNotSupportedException {
		return clone();
	}
	
	private ResumeTemplate deepCopy (ResumeTemplate rt) {
		try (
				ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
			
			objectOutputStream.writeObject(rt);
			try (
					ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
					ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
				return (ResumeTemplate) objectInputStream.readObject();
			}
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private ResumeTemplate deepClone () throws CloneNotSupportedException {
		return deepCopy(this);
	}
	
}
