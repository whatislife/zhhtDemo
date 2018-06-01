package zhhtDemo;

import java.io.UnsupportedEncodingException;

import com.zhht.util.SignatureUtil;
/**
 * 
* @ClassName: Test  
* <p>Description: 数据demo </p>
* @author 宋建 songjian@zhihuihutong.com 
* @date 2018年6月1日 下午9:18:54  
*
 */
public class Test {
	
	public static void main(String[] args) {
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode':'PARK20160119184999'}";
		try {
			String token = SignatureUtil.getMD5(SignatureUtil.getMD5(source + tokenKey1) + tokenKey2);
			System.out.println(token);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
