package com.javalec.base;

import java.util.Scanner;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	//	스캐너 생성
		
		int num1 = 0;	// 입력 변수값 	
		
		System.out.print("Input your number : ");	//	출력문 생성	
		num1 = scanner.nextInt();	//	변수입력 스캐너 생성
	
		for(int i = 1; i <= 9; i++) {	//	dan 반복문 생성 초기값/조건변동값/증감,감소
			for(int dan = num1; dan <= num1+3; dan++)	// dan 반복문 생성 초기값/조건변동값/증감,감소 {
				System.out.print(dan + " X " + i + " = " + (String.format("%2d", (dan*i))) + "\t");	//	곱하기 도출값 출력문 생성 스트링 포멧으로 출력 설정값 재설정 "%2d" 설정할정수의 칸
				
			    
			System.out.println(); // 4x1 ~ 7x1 반복후 다음칸으로 다음라인으로 넘기기위한 출력물
			}
		}
	}



