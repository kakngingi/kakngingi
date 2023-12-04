package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in); // 스캐너 생성
//		int num1 = 0; //	변수 생성
//		System.out.print("숫자를 입력하세요 : "); // 질문출력생성 
//		num1 = scanner.nextInt(); //	입력칸생성
//
//		if (num1 % 2 == 0) { // 짝수인지 판단하는 조건문
//			System.out.println("짝수입니다."); //	결과값도출
//		} else { //	아니라면? 
//			System.out.println("홀수입니다."); // 결과값도출ß
//		}

		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		int num1 = 0; // 입력받을 첫번째 변수 생성
		int num2 = 0; // 입력받을 두번째 변수 생성
		System.out.print("1번째 숫자를 입력하세요 : "); // 숫자 입력문 작성
		num1 = scanner.nextInt(); // 숫자 입력칸 생성
		System.out.print("2번째 숫자를 입력하세요 : "); // 숫자 입력문 작성
		num2 = scanner.nextInt(); // 숫자 입력칸 생성

		if (num1 > num2) { // 첫번째 숫자가 더 큰 경우의 조건문
			System.out.println("첫번째 숫자가 더 큽니다."); // 첫번째 숫자가 더 큰 경우의 출력문
		} else if (num2 > num1) { // 두번째 숫자가 더 큰 경우의 조건문
			System.out.println("두번째 숫자가 더 큽니다."); // 두번째 숫자가 더 큰 경우의 출력문
		} else {
			System.out.println("두 수가 같습니다."); // 두가지 조건문에 부합하지 않을때의 출력문

		}
	}
}
