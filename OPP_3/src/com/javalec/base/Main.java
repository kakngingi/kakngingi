package com.javalec.base;

import java.util.Scanner;

import com.javalec.fucntion.EvenOdd;
import com.javalec.fucntion.SumCalc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		SumCalc sumCalc = new SumCalc();	// 합계
		EvenOdd evenodd = new EvenOdd();	// 홀수 짝수
		
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int firstNum = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int secondNum = scanner.nextInt();
		
		int sum = sumCalc.sumCalc(firstNum, secondNum);	//	첫번째 숫자에서 두번째 숫자까지의 합계값
		System.out.println(firstNum + " ~ " + secondNum + "까지의 합계는 : " +sum);
		
		String result = "";	// 홀수 짝수 결과값
		result = evenodd.evenOdd(sum);	// 홀수 짝수
		System.out.println(result);
		
				}

}
