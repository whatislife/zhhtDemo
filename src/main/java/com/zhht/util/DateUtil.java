package com.zhht.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static int getMonths(Date beginDate , Date endDate){
		Calendar c = Calendar.getInstance();
		c.setTime(beginDate);
		//c.add(Calendar.YEAR, 1); // 年份加一年
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		c.setTime(endDate);
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH);

		int result;
		if (year == year1) {
			result = month1 - month;// 两个日期相差几个月，即月份差
		} else {
			result = 12 * (year1 - year) + month1 - month;// 两个日期相差几个月，即月份差
		}
		return result;
	}
	
	public static void main(String[] args) {
		String beginDate = "2016-04-01 11:31:15";
		String endDate = "2016-05-31 11:31:15";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date begin = sdf.parse(beginDate);
			Date end = sdf.parse(endDate);
			int i = getMonths(begin,end);
			System.out.println(i);
			int diff  = (int)(end.getTime()-begin.getTime());
			if(diff<0){
				System.out.println("结束时间必须大于开始时间");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void main2(String[] args) throws ParseException {
		String s = "20120601";
		String s1 = "20110512";
		Date m = new Date();
		Date d = null;
		Date d1 = null;

		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		try {
			d = df.parse(s);
			d1 = df.parse(s1);
			// 比较日期大小
			if (d.getTime() > d1.getTime()) {
				System.out.println(df.format(d));
			} else {
				System.out.println(df.format(d1));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		c.add(Calendar.YEAR, 1); // 年份加一年
		System.out.println(df.format(c.getTime()));// 按照yyyyMMdd格式输出

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);

		c.setTime(d1);
		int year1 = c.get(Calendar.YEAR);
		int month1 = c.get(Calendar.MONTH);

		int result;
		if (year == year1) {
			result = month1 - month;// 两个日期相差几个月，即月份差
		} else {
			result = 12 * (year1 - year) + month1 - month;// 两个日期相差几个月，即月份差
		}
	}
}