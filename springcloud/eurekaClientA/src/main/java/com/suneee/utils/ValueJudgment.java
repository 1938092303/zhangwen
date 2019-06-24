package com.suneee.utils;

import java.util.List;
/**
 * 
 * @author Administrator
 *
 */
public class ValueJudgment {
	/**
	 * 字符串为空
	 * @param str
	 * @return
	 */
	public static boolean stringIsNull(String str){
		if(str==null||"".equals(str)){
			return true;
		}
		return false;
	}
	/**
	 * 字符串不为空
	 * @param str
	 * @return
	 */
	public static boolean stringIsNotNull(String str){
		if(str!=null&&!"".equals(str)){
			return true;
		}
		return false;
	}
	/**
	 * list不为空
	 * @param list
	 * @return
	 */
	public static boolean listIsNotNull(List<?> list){
		if(list!=null&&list.size()>0){
			return true;
		}
		return false;
	}
	/**
	 * 数组不为空
	 * @param list
	 * @return
	 */
	public static boolean arrIsNotNull(String []str){
		if(str!=null&&str.length>0){
			return true;
		}
		return false;
	}
	
	
	
}
