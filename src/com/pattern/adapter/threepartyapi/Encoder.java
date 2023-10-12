package com.pattern.adapter.threepartyapi;

import sun.misc.BASE64Encoder;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * @Author Zzs
 * @Description 这是题目中所提到的第三方库的简易类，里面封装了加密算法，有些甚至没有源代码
 * @DateTime 2023/10/12 19:09
 */
public class Encoder {
	
	public static final String KEY_MD5 = "MD5";
	
	public static String THREE_PARTY_MD5 (String input) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance(KEY_MD5);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		assert md5 != null;
		md5.update(input.getBytes());
		return new BigInteger(1, md5.digest()).toString(16);
	}
	
	public static String THREE_PARTY_BASE64 (String input) {
		return (new BASE64Encoder()).encode(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String NO_ENCODE () {
		return null;
	}
	
}
