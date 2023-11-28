package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		1. 시작하는 숫자를 정하세요 : 1000
//		2. 범위의 끝 숫자를 정하세요 : 5
//		3. 원하는 배수는 ? 5
//				
//		결과)
//		5부터 1000의 범위중 5의 배수의 숫자의 갯수는 200개이고 합은 100500입니다.
//		5의 배수의 평균은 502.5이고
//		5의 배수의 숫자중 최대 숫자는 1000이고 최소 숫자는 5입니다.
		
	// 스캐너 생성
		Scanner scanner = new Scanner(System.in);
		
	// 입력받을 변수
		int num1 = 0; 				// 시작하는 숫자
		int num2 = 0;				// 끝 숫자
		int num3 = 0; 				// 원하는 배수의 숫자
		int num4 = 0;				// 입력한 배수의 최대값
		int tot = 0; 				// num3의 배수의 총합
		int totCnt = 0; 			// num3의 배수의 갯수
		int firstNum = 0; 			// 최소 숫자
		int secondNum = 0; 			// 최대 숫자 
	
	// 입력 받기	
	System.out.print("1. 시작하는 숫자를 정하세요 : ");
	num1 = scanner.nextInt();
	System.out.print("2. 범위의 끝 숫자를 정하세요 : ");
	num2 = scanner.nextInt();
	System.out.print("3. 원하는 배수는 ? ");
	num3 = scanner.nextInt();
	
	// 시작숫자와 범위의 끝수자를 비교해서 시작과 끝을 정하자 
	if(num1 > num2) {
		firstNum = num2;
		secondNum = num1;
	}
	else { // num2 > num1
		firstNum = num1;
		secondNum = num2;
	}
	// 숫자의 (총합/배수의 갯수) 구하기
	for(int i=firstNum; i<=secondNum; i++) {
		
		
		if(i % num3 == 0) {
			tot += i; // 입력숫자내의 num3의 배수의 총합
			totCnt++; // 입력숫자내의 num3의 배수의 갯수
		if(num4 < i) {
			num4 = i; // 입력한 배수의 최대값 
			
			
		}
	}
}		
					
	// 출력하기 
	System.out.println(num1 + "부터 " + num2 + "의 범위중 " + num3 +"의 배수의 숫자의 갯수는 " + totCnt + "이고 합은 " + tot + "입니다.");
	System.out.println(num3 + "의 배수의 평균은 " + ((double)tot/totCnt) + "이고");
	System.out.println(num3 + "의 배수의 숫자중 최대 숫자는 " + num4 + "이고 최소 숫자는 " + firstNum +"입니다." );

	

	
	}
}
