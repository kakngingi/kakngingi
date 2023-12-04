package com.javalec.base;

import java.util.Scanner;

public class If_01 {

	public static void main(String[] args) {
		// 비교문, 조건문, Conditional Statement
		// Property
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String result = ""; //판단결과
		
		// 숫자 2개 받아오기
		// Input
		System.out.print("첫번째 숫자를 입력하세요 :");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 :");
		num2 = scanner.nextInt();
		
		
		// num1이 num2보다 큰지 작은지 같은지 판단
		// Process
		if(num1 > num2) {
			 result = "보다 큽니다.";
		}else if(num1 < num2) {
			 result = "보다 작습니다.";
		}else {
			 result = "와 같습니다.";
		}
		
		// Output
		System.out.println(num1 + "이(가) " + num2 + result);
		System.out.println(">>>>> End <<<<<");
	}

}
