package com.javelec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2 = 8000;
		int num3 = 5000;
		int num4 = 3000;
		String result = "";
		
		System.out.print("금액을 입력하세요 : ");
		num1 = scanner.nextInt();
		
		
		if(num1 > num2) {
			result = "너무 비쌉니다.";
		}else if(num1 > num3){
			result = "조금 비쌉니다.";
		}else if(num1 > num4) {
			result = "적당한 금액입니다.";
		}else {
				result = "싼편 입니다.";
			}
		
	System.out.println(result);
	}
					

}
