package com.javalec.base;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
/*	6번 퀴즈
	더하기 할 숫자들의 개수를 정한 후 숫자를 입력 받아서 입력한 숫자의 합을 구하는 프로그램작성.

	몇개의 숫자를 더할까요 ? : 4
	4개의 숫자를 입력하세요
	1
	2
	3
	4
	입력한 숫자의 합은 10 입니다.	
 */

		Scanner scanner = new Scanner(System.in);

		int num1 = 0;	// 입력값
		int num2 = 0;	
		int tot = 0;	// 입력한 숫자들의 합계값

		System.out.print("몇개의 숫자를 더할까요 ? : ");
		num1 = scanner.nextInt();
		System.out.println(num1 + "개의 숫자를 입력하세요");
		for (int i = 1; i <= num1; i++) { // 반목문 조건내에서 반복실행	(초기값,조건값,증감식)
			num2 = scanner.nextInt();
			tot += num2; // 입력한 숫자들의 누적합계
		}
		System.out.println("입력한 숫자의 합은 " + tot + " 입니다.");
	}

}