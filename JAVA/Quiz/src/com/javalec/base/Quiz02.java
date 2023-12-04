package com.javalec.base;

public class Quiz02 {

	public static void main(String[] args) {
/*	2번 퀴즈
  	10의 10^0 ~ 10^10까지의 제곱승을 구하라.		
  		
				10^ 0 =           1
				10^ 1 =          10
				10^ 2 =         100
				10^ 3 =        1000
				10^ 4 =       10000
				10^ 5 =      100000
				10^ 6 =     1000000
				10^ 7 =    10000000
				10^ 8 =   100000000
				10^ 9 =  1000000000
				10^10 = 10000000000
*/
		String result = "0"; // 결과값
		String num = ""; // 결과값
		long k = 1; // 숫자의 값이 큰경우 int로 하면 오류가 발생 더 큰 범위의 long 사용

		for (int i = 0; i <= 10; i++) { // 반복문 (초기값; 조건식; 증감식)
			num = String.format("%2d", i); // 곱해지는 출력값의 문자열 형식 지정 (설정값,변수)
			result = String.format("%11d", k); // 결과의 출력값 문자열 형식 지정 (설정값,변수)
			k *= 10; // 제곱근의 결과값 (k=k*10을 계속 누적함)
			System.out.println("10^" + num + " = " + result); // 출력물을 반복문안에 작성하여 i값 내에서 반복출력
		}

	}

}