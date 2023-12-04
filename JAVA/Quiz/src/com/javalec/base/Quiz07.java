package com.javalec.base;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
/*	7번 퀴즈
 숫자 삼각형에 프로그램 작성.
 
 몇 단계의 파라미드로 구성할까 ? : 5
  1
  2  3
  4  5  6
  7  8  9 10
 11 12 13 14 15
 */
		
		Scanner scanner = new Scanner(System.in); 	//	스캐너 생성

		int num1 = 0;	//	입력값
		int cnt = 0;	// 합계값

		System.out.print("몇 단계의 파라미드로 구성할까 ? : ");	 //	출력문 생성
		num1 = scanner.nextInt();	//	입력칸 생성

		for (int i = 1; i <= num1; i++) {	// 반복문(행) (초기값; 조건식; 증감식)
			for (int j = 0; j < i; j++) {	// 반복문(열) (초기값; 조건식; 증감식)
				cnt++;	// 피라미드를 만들 누적 숫자 

				System.out.print(String.format("%3d", cnt)); //	피라미드 숫자의 출력값 문자열 형식지정 (설정값,변수)
			}
			System.out.println();	//	다음줄로 넘어가기 위해 두번쨰 조건문 밖에서 작성
		}

	}
}