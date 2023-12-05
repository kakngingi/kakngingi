package com.javalec.fucntion;

public class SumEvenOdd {

	public SumEvenOdd() {
	}

	// 합계 홀수,짝수 구하기
	public int sumCalc(int startNum, int endNum) {

		int sum = 0;

		for (int i = startNum; i <= endNum; i++) {
			sum += i;

		}
		return sum;
	}

	public String evenOdd(int sum) {
		String result = "";

		if (sum % 2 == 0) {
			result = "짝수입니다.";
		} else {
			result = "홀수입니다.";
		}

		return result;
	}
}
