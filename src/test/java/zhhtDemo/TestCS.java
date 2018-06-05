package zhhtDemo;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.zhht.util.HttpUtil;
import com.zhht.util.SignatureUtil;
public class TestCS {
	@Test
	public void queryParkMessage(){
		String url = "http://47.95.161.115/sym/cps/park/queryParkMessage";
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode':'PA20170919220546'}";
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
	@Test
	public void queryParkRecord(){
		String url = "http://47.95.161.115/sym/cps/park/queryParkRecord";
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode': 'PA20170919220546','beginTime': '2018-05-30 19:47:39','endTime': '2018-05-30 19:52:43'}";
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
