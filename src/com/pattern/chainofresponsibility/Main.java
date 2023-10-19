package com.pattern.chainofresponsibility;

import com.pattern.chainofresponsibility.filter.BinaryToByteArrayFilter;
import com.pattern.chainofresponsibility.filter.FloatToIntFilter;
import com.pattern.chainofresponsibility.filter.IntToBinaryFilter;
import com.pattern.chainofresponsibility.filter.StartFilter;

import java.util.Arrays;

/*
 * @Author Zzs
 * @Description
 * @DateTime 2023/10/19 18:07
 */
public class Main {
	public static void main (String[] args) {
		StartFilter startFilter = new StartFilter();
		FloatToIntFilter floatToIntFilter = new FloatToIntFilter();
		IntToBinaryFilter intToBinaryFilter = new IntToBinaryFilter();
		BinaryToByteArrayFilter binaryToByteArrayFilter = new BinaryToByteArrayFilter();
		startFilter.setNext(floatToIntFilter).setNext(intToBinaryFilter).setNext(binaryToByteArrayFilter).setNext(null);
		
		float f = 14.1f;
		byte[] result = startFilter.filtrate(f);
		System.out.println(Arrays.toString(result));
		f = 13.2f;
		result = startFilter.filtrate(f);
		System.out.println(Arrays.toString(result));
		
		intToBinaryFilter.setNext(null);
		String re = startFilter.filtrate(f);
		System.out.println(re);
	}
}
