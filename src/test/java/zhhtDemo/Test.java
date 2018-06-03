package zhhtDemo;

import java.io.UnsupportedEncodingException;

import com.zhht.util.HttpUtil;
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
//		String url = "http://localhost:8083/zhht_cps/cps/park/queryParkMessage";
//		//测试阶段使用
//		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
//		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
//		String source = "{'parkCode':'PA20161116002012'}";
//		try {
//			String token = SignatureUtil.getMD5(SignatureUtil.getMD5(source + tokenKey1) + tokenKey2);
//			System.out.println(token);
//			String param = source;
//			String sendHttpGET = HttpUtil.sendHttpPOST(url+"?token="+token,param,"application/json;charset=UTF-8");
//			System.out.println("sendHttpGET-"+sendHttpGET);
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
		String url = "http://localhost:8083/zhht_cps/cps/park/queryParkRecord";
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode': 'PA2018110','beginTime': '2018-09-01 09:04:27','endTime': '2018-08-01 09:08:27'}";
		try {
			String token = SignatureUtil.getMD5(SignatureUtil.getMD5(source + tokenKey1) + tokenKey2);
			System.out.println(token);
			String param = source;
			String sendHttpGET = HttpUtil.sendHttpPOST(url+"?token="+token,param,"application/json;charset=UTF-8");
			System.out.println("sendHttpGET-"+sendHttpGET);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}

}
