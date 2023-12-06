package com.javalec.fucntion;

public class SumEvenOdd {

	public SumEvenOdd() {
	}

	// 합계 홀수,짝수 구하기
	public int sumCalc(int startNum, int endNum) {	//	작은숫자 큰숫자 파라미터 선언

		int sum = 0;	//	합계

		for (int i = startNum; i <= endNum; i++) {	// 작은숫자에서 큰숫자까지 반복문 	
			sum += i;	// 누적합계

		}
		return sum;
	}

	public String evenOdd(int sum) {
		String result = "";	//	짝수 홀수 결과값

		if (sum % 2 == 0) {	//	짝수 홀수 조건문
			result = "짝수입니다.";	
		} else {
			result = "홀수입니다.";
		}

		return result;
	}
}
