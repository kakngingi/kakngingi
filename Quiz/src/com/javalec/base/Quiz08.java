package com.javalec.base;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
/*	8번 퀴즈
	몇 개의 숫자를 입력할지 결정한 후
	숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라.

	입력할 숫자의 갯수 ? (100개 미만) : 5
	5개의 숫자를 입력하세요
	11
	12
	13
	14
	15
	입력한 숫자중 최대값은 15이고 5번째 값 입니다.	
*/
		Scanner scanner = new Scanner(System.in); 
		
		int num1 = 0; // 갯수값
		int num2 = 0; // 입력값
		int maxNum = Integer.MIN_VALUE; // 최대값

		int j = 0;	//	순번값을 부여하기위해 변수생성

		System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
		num1 = scanner.nextInt();
		System.out.println(num1 + "개의 숫자를 입력하세요"); 
		for(int i = 1; i <= num1; i++) {	//	반목문으로 조건반복 (초기값,조건값,증가)
		num2 = scanner.nextInt();
			
		if (num2 > maxNum) {	//	조건문
			maxNum = num2;	//	입력값내에 담겨진 최대값 지정
			j = i;	//	변수에 순번값을 부여
			
				}	
			}
		
		System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + j + "번째 값 입니다.	" );	//	결과 출력문

	}
}

