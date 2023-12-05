package com.javalec.base;

import java.util.Scanner;

import com.javalec.fucntion.EvenOdd;
import com.javalec.fucntion.SumCalc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		SumCalc sumCalc = new SumCalc();
		EvenOdd evenodd = new EvenOdd();
		
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int firstNum = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int secondNum = scanner.nextInt();
		
		int sum = sumCalc.sumCalc(firstNum, secondNum);
		System.out.println(firstNum + " ~ " + secondNum + "까지의 합계는 : " +sum);
		
		String result = "";
		result = evenodd.evenOdd(sum);
		System.out.println(result);
		
				}

}
