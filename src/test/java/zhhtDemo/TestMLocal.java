package zhhtDemo;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import com.zhht.util.HttpUtil;
import com.zhht.util.SignatureUtil;
public class TestMLocal {
	@Test
	public void queryParkMessage(){
		String url = "http://localhost:8083/zhht_cps/cps/park/queryParkMessage";
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode':'PA20161116002012'}";
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
		String url = "http://localhost:8083/zhht_cps/cps/park/queryParkRecord";
		//测试阶段使用
		String tokenKey1="RlE3RUdONUlOQVoyWUZHVkZQN0lHUUlSUUJQNU9GTzFUVlFSWVBWUEFJWERQTks0UUFVRVBXV0dVRkhVSUtDRjdZRENISFZW";
		String tokenKey2="NFVDSlQwNExMUVVDMkEzRzlWSFNETFFLVDdOS0ozWjBOS1VYSEhDWVhYVVkxV0tBSVNSTlFSV0lZSktYRTJYR05PSFVZSjdT";
		String source = "{'parkCode': 'PA20171201141602','beginTime': '2018-05-09 16:47:47','endTime': '2018-05-09 16:47:55'}";
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
