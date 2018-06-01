package com.zhht.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * 
* @ClassName: LLPayUtil  
* <p>Description: 加密工具类  </p>
* @author 宋建 songjian@zhihuihutong.com 
* @date 2018年6月1日 下午9:05:41  
*
 */
public class SignatureUtil {
	/**
	 * 方法名称：getMD5 
	 * 功    能：字符串MD5加密 
	 * 参    数：待转换字符串 
	 * 返 回 值：加密之后字符串
	 */
	public static String getMD5(String sourceStr) throws UnsupportedEncodingException {
		String resultStr = "";
		char[] digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
				'9', 'A', 'B', 'C', 'D', 'E', 'F' };
		try {
			byte[] temp = sourceStr.getBytes("utf-8");
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(temp);
			// resultStr = new String(md5.digest());
			byte[] b = md5.digest();
			for (int i = 0; i < b.length; i++) {
				char[] ob = new char[2];
				ob[0] = digit[(b[i]>>> 4) & 0X0F];
				ob[1] = digit[b[i] & 0X0F];
				resultStr += new String(ob);
			}
			return resultStr;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}
}
