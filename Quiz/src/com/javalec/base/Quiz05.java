package com.javalec.base;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
/*	5번 퀴즈
	입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.

		Enter an integer(0 ~ 9) : 12345678
		Sum of digits = 36
*/
		Scanner scanner = new Scanner(System.in);
		int num = 0; // 입력값
		int tot = 0; // 합계값

		System.out.print("Enter an integer(0 ~ 9) : ");
		num = scanner.nextInt();	//	입력칸 생성
		while (num != 0) {	//	 반복문(조건식;)
			tot += num % 10;	//	ex) 123456%10을 (%)으로 나눌경우(12345.6) .뒤에 나머지 숫자들의 합계
			num /= 10;	//	ex) 123456/10을 (/)으로 나눌경우(12345) .뒤에 숫자는 출력안됨 그럼 12345 로 올라가서 다시 반복문 실행

		}

		System.out.print("Sum of digits = " + tot); // 나머지 숫자들의 합계 출력물
	}
}