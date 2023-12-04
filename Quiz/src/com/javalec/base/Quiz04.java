package com.javalec.base;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
/*	4번 퀴즈
	입력한 숫자부터 4개를 증가하여 화면 가로로 구구단을 표시하기. (단 for문은 1개만 사용하기)
	 
			Input your number : 4
			4 X 1 =  4	5 X 1 =  5	6 X 1 =  6	7 X 1 =  7	
			4 X 2 =  8	5 X 2 = 10	6 X 2 = 12	7 X 2 = 14	
			4 X 3 = 12	5 X 3 = 15	6 X 3 = 18	7 X 3 = 21	
			4 X 4 = 16	5 X 4 = 20	6 X 4 = 24	7 X 4 = 28	
			4 X 5 = 20	5 X 5 = 25	6 X 5 = 30	7 X 5 = 35	
			4 X 6 = 24	5 X 6 = 30	6 X 6 = 36	7 X 6 = 42	
			4 X 7 = 28	5 X 7 = 35	6 X 7 = 42	7 X 7 = 49	
			4 X 8 = 32	5 X 8 = 40	6 X 8 = 48	7 X 8 = 56	
			4 X 9 = 36	5 X 9 = 45	6 X 9 = 54	7 X 9 = 63	
 */
		Scanner scanner = new Scanner(System.in);

		int num1 = 0; // 입력값

		System.out.print("Input your number : "); 
		num1 = scanner.nextInt();
		for (int i = 1, dan = num1; i <= 9 && dan <= num1 + 3; dan++) { // 반복문 (초기값; 조건식; 증감식) 입력값에 조건주어 조건내에서 반복
			System.out.print(dan + " X " + i + " = " + (String.format("%2d", (dan * i))) + "\t"); //	출력문 생성, 출력값 문자열 형식지정 (설정값,변수)
																									
			if (dan == num1 + 3) { // 다음줄에 구구단을 다시 반복하기 위한 조건문
				dan = num1 - 1; // 조건문에 일치하여 반복문 빠져나온후 다음줄 출력시 입력값과 동일하게 초기화
				i++; //	가로로 결과값이 출력되기때문에 반복문실행후 조건문 다음 증가

				System.out.println(); // 4x1 ~ 7x1 반복후 다음라인으로 넘기기위한 출력물
			}
		}
	}
}
