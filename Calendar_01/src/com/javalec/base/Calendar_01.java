package com.javalec.base;

import java.time.Year;
import java.util.Calendar;

public class Calendar_01 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		String[] dateName = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일",};
		
		
		int year = calendar.get(Calendar.YEAR);	//	년도
		int month = calendar.get(Calendar.MONTH) + 1; // 배열이라 순서가 0부터 나옴 우리가 보기위해서는 +1 해줘야함
		int day = calendar.get(Calendar.DAY_OF_MONTH);	//	몇일
		int date = calendar.get(Calendar.DAY_OF_WEEK);	//	 몇요일 일요일부터 0으로시작
		int hour = calendar.get(Calendar.HOUR);	//	시간
		int minute = calendar.get(Calendar.MINUTE);	// 몇분
		int second = calendar.get(Calendar.SECOND);	//	몇초
		
		
		System.out.println(year + "-" + month + "-" + String.format("%02d", day) + "(" + dateName[date]+")");
		System.out.println(String.format("%02d", hour)+ ":" + minute + ":" + second);
		
		
	}

}