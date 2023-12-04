package com.javalec.base;

import java.util.Scanner;

public class If_03 {

	public static void main(String[] args) {
		// Property
		Scanner scanner = new Scanner(System.in);
			int num1 = 0;
		String result = "";
				
				// Input
		System.out.print("성적을 입력하세요 : ");
				num1 = scanner.nextInt();
				
				// Process
			if(num1 >= 101 || num1 < 0) {
					result = "다시 입력하세요";
			}else if (num1 <= 100 && num1 >= 90) {
					result = "A 학점 입니다.";
			}else if (num1 < 90 && num1 >= 80) {
					result = "B 학점 입니다.";
			}else if (num1 < 80 && num1 >= 70) {
					result = "C 학점 입니다.";
			}else if (num1 < 70 && num1 >= 60) {
					result = "D 학점 입니다.";
			}else if (num1 < 60 && num1 >= 50) {
					result = "E 학점 입니다.";	
			}else {
					result = "F 학점 입니다.";	
				}
				// Output
		System.out.println("귀하의 학점은 " + result);
		}

	

}
