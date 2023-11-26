package com.Javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		// 사용자에게 입력 받기! (정수)
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 :");
		int inputNum = scanner.nextInt();
		System.out.println("입력된 숫자는" + inputNum + "입니다.");
		
		// 사용자가 입력한 숫자가 짝수 인지 홀수 인지 출력하기
	
//		System.out.println(aId == cId ? "환영합니다" : "id나 password를 다시 입력 하세요");
		//System.out.println("7이 3의 배수인가? :" + (7 % 3 == 0 ? "3의배수" : "3의배수 아님"));
		//String result = (7 % 3 == 0 ? "3의배수" : "3의배수 아님");
		//System.out.println(result);
		
		System.out.println(inputNum % 2 == 1 ? "홀수입니다" : "짝수입니다");
		
	}

}
 