package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch
		Scanner scanner = new Scanner(System.in);
		int inputNumber = 0;
		String result = "";
	
		
		System.out.print("숫자를 입력하세요 : ");
		inputNumber = scanner.nextInt();
		
		/* if문 적용
		if(inputNumber % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		*/
		
		// Switch문 적용
		switch(inputNumber % 2) {
		case 0:
			result = "짝수";
			break;
		case 1:
			result = "홀수";
			break;
		default:
			break;
		}
		System.out.println("입력하신 숫자 " + inputNumber + "은(는) " + result + "입니다.");
	}

}
