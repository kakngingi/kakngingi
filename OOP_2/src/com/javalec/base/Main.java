package com.javalec.base;

import java.util.Scanner;

import com.javalec.fucntion.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		SumEvenOdd sumEvenOdd = new SumEvenOdd(); // 합계 홀수 짝수 구하기

		int startNum = 0;	// 작은 숫자
		int endNum = 0;	// 큰 숫자
		int sum = 0;	// 합계
		String result = "";	//	홀수 짝수 결과값

		System.out.print("범위의 숫자중 작은 숫자 : ");
		startNum = scanner.nextInt();

		System.out.print("범위의 숫자중 큰 숫자 : ");
		endNum = scanner.nextInt();


		sum = sumEvenOdd.sumCalc(startNum, endNum);	// 작은 숫자에서 큰 숫자까지의 합계 누적값
		System.out.println(startNum + " ~ " + endNum + " 까지의 합계는 : " + sum);	
		result = sumEvenOdd.evenOdd(sum);	//	짝수 홀수 결과 출력값
		System.out.println(result);
		
	}

}
