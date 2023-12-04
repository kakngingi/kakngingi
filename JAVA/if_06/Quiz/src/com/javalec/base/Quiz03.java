package com.javalec.base;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
/*	3번 퀴즈
 	입력한 수의 factorial 구하기 (예: 4!= 4x3x2x1)
 
		Input your decimal no. : 4
		4's factorial value =	24	
*/
		Scanner scanner = new Scanner(System.in);
		int num = 0; // 입력값
		int sum = 1; // 곱하기 누적 합계값
		System.out.print("Input your decimal no. : ");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) { // 반복문 (초기값; 조건식; 증감식)
			sum *= i; // 합계값을 곱셈하여 누적

		}
		System.out.println(num + "'s factorial value = " + "\t" + sum); // 반복문 밖에 출력하여 찾고자하는 누적 결과값만 출력

	}

}
