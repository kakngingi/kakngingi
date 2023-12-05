package com.javalec.base;

import java.util.Scanner;

import com.javalec.fucntion.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		SumEvenOdd sumEvenOdd = new SumEvenOdd();

		int startNum = 0;
		int endNum = 0;
		int sum = 0;
		String result = "";

		System.out.print("범위의 숫자중 작은 숫자 : ");
		startNum = scanner.nextInt();

		System.out.print("범위의 숫자중 큰 숫자 : ");
		endNum = scanner.nextInt();


		sum = sumEvenOdd.sumCalc(startNum, endNum);
		System.out.println(startNum + " ~ " + endNum + " 까지의 합계는 : " + sum);
		result = sumEvenOdd.evenOdd(sum);
		System.out.println(result);
		
	}

}
