package com.javalec.base;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
/*	10번 퀴즈
	10개의 점수(0점 부터 99점)을 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라.
 
		Input score : 
		1의 Score :34
		2의 Score :32
		3의 Score :55
		4의 Score :57
		5의 Score :59
		6의 Score :53
		7의 Score :90
		8의 Score :99
		9의 Score :88
		10의 Score :12
		---------- Histogram ----------
		 90 : ##
		 80 : #
		 70 : 
		 60 : 
		 50 : ####
		 40 : 
		 30 : ##
		 20 : 
		 10 : #
		  0 : 
*/
		Scanner scanner = new Scanner(System.in); 

		int[] score = new int[10];	//	입력받을 10개의 배열

		System.out.println("Input score : "); 

		for (int i = 0; i < score.length; i++) {	//	반복문(초기값,조건식,증감식)
			System.out.print((i + 1) + "의 Score :");
			int num = scanner.nextInt();
			score[num / 10]++;	//	넓은 범위의 점수를 좁혀주기 위해 점수값에 축소함
		}
	
		System.out.println("---------- Histogram ----------"); 

		for (int i = (score.length - 1); i >= 0; i--) {	//	반복문(초기값,조건식,증감식) 점수분도를 10점간격으로 만들기위한 조건문
			System.out.print(String.format("%3d : ", i * 10));	// 출력값 문자열의 형식지정(설정값,변수) 오른쪽정렬하여 10점단위 분포도를 만들기위해 *10을 해줌
			for (int j = 1; j <= score[i]; j++) {	//	반복문(초기값,조건식,증감식) 점수배열에있는 앞자리 숫자의 갯수에따라 #을 표시하기위한 조건문
				System.out.print("#"); 
				
			}
		System.out.println();	//	줄뛰기

		}
	}
}