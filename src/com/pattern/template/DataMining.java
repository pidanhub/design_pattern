package com.pattern.template;

import com.pattern.template.algorithms.Algorithm;

/*
 * @Author Zzs
 * @Description 考虑到只有一个方法在不同的算法当中有所不同，故而没有必要专门为这一个函数写很多的子类
 * @DateTime 2023/10/12 21:07
 */
public class DataMining {
	
	private final Algorithm algorithm;
	
	public DataMining (Algorithm algorithm) {
		System.out.println("开始读取数据");
		this.algorithm = algorithm;
	}
	
	public final void dataMining () {
		readData();
		convertDataFormat();
		algorithm();
		displayResult();
		
		System.out.println("数据挖掘结果已发至您的邮箱\n");
	}
	
	private void readData () {
		System.out.println("①读取数据");
	}
	
	private void convertDataFormat () {
		System.out.println("②转换数据格式");
	}
	
	/**
	 * @see Algorithm 函数式接口，比专门为这一个函数创建多个子类的方法更好一些
	 */
	void algorithm () {
		System.out.println("-----适配器模式：根据需求，可能第三步当中还有一些共性，调用之前处理ing-----");
		algorithm.invoke();
		System.out.println("-----算法调用结束-----");
	}
	
	private void displayResult () {
		System.out.println("④显示数据分类结果");
	}
}
