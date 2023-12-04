package com.javalec.base;

import java.time.Year;
import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		String[] dateName = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일",};
		
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; // 배열이라 순서가 0부터 나옴 우리가 보기위해서는 +1 해줘야함
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int date = calendar.get(Calendar.DAY_OF_WEEK);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		
		System.out.println(year + "-" + month + "-" + String.format("%02d", day) + "(" + dateName[date-1]+")");
		System.out.println(String.format("%02d", hour)+ ":" + minute + ":" + second);
		
		
	}

}
