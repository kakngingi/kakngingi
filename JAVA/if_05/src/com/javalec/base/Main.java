package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scanner.nextInt();
//		a    b
//		10 > 20 
//		a 10 
			if (num2 > num1) {
			System.out.println("두번쩨 숫자가 " + (num2 - num1) + "만큼 큽니다.");
		}
			else{
			System.out.println("첫번째 숫자가 " + (num1 - num2) + "만큽 큽니다.");
		}
	}
}