package com.javalec.base;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	//	스캐너 생성
		int num = 0;	// 입력 변수값
		int sum = 1;	// 합계 곱하기 값
		System.out.print("Input you decimal no. : ");	// 입력 출력물 생성
		num = scanner.nextInt();	// 입력칸 생성

		for (int i =1; i <= num; i++) {	// 반복문 작성
			sum*=i;	// 입력값들의 누적 곱하기값 ex) 4입력 4x3x2x1이 sum 
		}
		System.out.println(num + "'s factorial value = " + sum); //	출력문을 for문 밖에서 출력해야 출력문이 반복이 안됨
		
//		sum*=i;
//		
//		sum = sum*i;
		
	}

}
