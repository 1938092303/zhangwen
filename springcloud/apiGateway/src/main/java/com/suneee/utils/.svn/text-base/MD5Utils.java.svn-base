package com.suneee.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 
 * @author Administrator
 *
 */
public class MD5Utils {
	/***
	 * MD5加码 生成32位md5码
	 */
	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++){
			byteArray[i] = (byte) charArray[i];
		}
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16){
				hexValue.append("0");
				}
			hexValue.append(Integer.toHexString(val));
		}
		// 返回16位
		// return hexValue.toString().substring(8, 24);
		// 返回32位
		return hexValue.toString();

	}

	/**
	 * 加密解密算法 执行一次加密，两次解密
	 */
	public static String convertMD5(String inStr) {

		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;

	}

	/**
	 * 静态方法，便于作为工具类
	 * @param plainText
	 * @return
	 */
	public static String getMd5(String plainText) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(plainText.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0){
					i += 256;
				}
				if (i < 16){
					buf.append("0");
				}
				buf.append(Integer.toHexString(i));
			}
			
			// 16位的加密
			// return buf.toString().substring(8, 24);
			// 32位加密
			return buf.toString();
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}

	}
	
	public static String JM(String inStr) {
		 if (ValueJudgment.stringIsNotNull(inStr)) {
			 char[] a = inStr.toCharArray();   
			  for (int i = 0; i < a.length; i++) {   
			   a[i] = (char) (a[i] ^ 't');   
			  }   
			  String k = new String(a);   
			  return k; 
		}
		 return null;
		   
	 }   
		   

	public static void main(String[] args) {
		// 测试
//		 String s = new String("tangfuqiang");
//		 System.out.println("原始：" + s);
//		 System.out.println("MD5后：" + string2MD5(s));
//		 System.out.println("加密的：" + convertMD5(s));
//		 System.out.println("解密的：" + convertMD5(convertMD5(s)));

		String s = "esapos123";
		System.out.println("MD5后：" + string2MD5(s));
		System.out.println("MD5后：" + getMd5(s));
		//System.out.println("解密的：" + JM(getMd5("95610299aae7dcb57ded3c6602f76dc7")));
		 
		System.out.println(convertMD5(new String("f5dd39b4ab584c653cdcd3937fe74244")));
	}

}
