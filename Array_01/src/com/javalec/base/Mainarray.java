package com.javalec.base;

public class Mainarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] weekDay = new String[7];
		weekDay[0] = "일요일";
		weekDay[1] = "월요일";
		weekDay[2] = "화요일";
		weekDay[3] = "수요일";
		weekDay[4] = "목요일";
		weekDay[5] = "금요일";
		weekDay[6] = "토요일";
		
		
//		System.out.println(weekDay.length); //	크기를 나타냄 
//		for(int i = 0; i<weekDay.length; i++) { // 시작값 0 1씩 증가해서 6까지만 출력
//			if(i % 2 == 0) //	짝수만 출력
//			System.out.println(weekDay[i]);
//		}
		int i = 0;
		
		while(i < weekDay.length) {
			if(i % 2 ==0) {
				System.out.println(weekDay[i]);
				}
				i++;
			
		}
		System.out.println();
	
//		int i = 0;
//		
//		while(i < weekDay.length) {
//			System.out.println(weekDay[i]);
//			i++;
//		
//			}
		
		
	}
}
