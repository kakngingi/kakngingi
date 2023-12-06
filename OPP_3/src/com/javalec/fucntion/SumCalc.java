package com.javalec.fucntion;

public class SumCalc {
	public SumCalc() {
	}

	public int sumCalc(int firstNum, int secondNum) {	// 첫번째정수, 두번째정수 파라미터 지정
		int sum = 0;	// 합계변수
		for (int i = firstNum; i <= secondNum; i++) {	// 조건반복문
			sum += i;	// 합계 누적값

		}
		return sum;
	}
}
