package com.pattern.template;

import com.pattern.template.algorithms.DecisionTree;
import com.pattern.template.algorithms.NaiveBayes;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/12 13:27
 */
public class Main {
	public static void main (String[] args) {
		DataMining dataMining1 = new DataMining(new DecisionTree());
		dataMining1.dataMining();
		
		DataMining dataMining2 = new DataMining(new NaiveBayes());
		dataMining2.dataMining();
		
		DataMining dataMining3 = new DataMining(() -> System.out.println("调用KNN算法"));
		dataMining3.dataMining();
	}
}
