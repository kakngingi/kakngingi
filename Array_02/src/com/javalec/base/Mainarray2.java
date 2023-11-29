package com.javalec.base;

public class Mainarray2 {

	public static void main(String[] args) {
		
//		String[] str = {"a","b"};
//		int[] intNum = {1,2};
//		double[] doubleNum = {1.2, 2.3};
//		boolean[] boolNum = {true, false};
		// 평균구하기
		
//		int[] intNum = {1, 5, 8, 12, 200, 1002};
//		int total = 0;
//		
//		//	Total 구하기
//		//	intNum[0] + intNum[1] + ... + intNum[5]
//		for( int i = 0; i < intNum.length; i++)
//			total += intNum[i];
//			
//		//	System.out.println(total);
//		
//		
//		//	Total / 갯수
//		System.out.println((double)total/intNum.length);
//		
		//	배열 구구단 : 가로로 출력하기
		
		int[] danNum = {5,3,9};
		
		for(int i = 1; i <= 9; i++)
			for(int a = 0; a < danNum.length; a++) {
				System.out.print(danNum[a] + " X " + i + " = " + (danNum[a]*i) + "\t");
					
				if(danNum[a] == danNum[2]) {
					
			System.out.println("");
				
			}
			
				
			
			
				 
			 
		
		
			
		
				
		
		}
		
//		for(int i = 1; i <= 9; i++) {
//			System.out.print(danNum[0] + " X " + i + " = " + (danNum[0]*i) + "\t");
//			System.out.print(danNum[1] + " X " + i + " = " + (danNum[1]*i) + "\t");
//			System.out.println(danNum[2] + " X " + i + " = " + (danNum[2]*i) + "\t");
//			
//		}

	}

}
