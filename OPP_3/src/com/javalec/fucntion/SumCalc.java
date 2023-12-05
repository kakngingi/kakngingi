package com.javalec.fucntion;

public class SumCalc {
	public SumCalc() {
	}

	public int sumCalc(int firstNum, int secondNum) {
		int sum = 0;
		for (int i = firstNum; i <= secondNum; i++) {
			sum += i;

		}
		return sum;
	}
}
