package www.javalec.base;

import java.util.Scanner;

import www.javalec.fucntion.SumEvenOdd;

public class Main {

	public static void main(String[] args) {
		// 범위의 합계를 구하고 홀수 짝수 판별한다.

				Scanner scanner = new Scanner(System.in);
				SumEvenOdd evenOdd = new SumEvenOdd(); // 이븐우드라는 다른패키지의 클라스와 연결
				int startNum = 0;	//	작은 숫자
				int endNum = 0;	//	큰 숫자
				int sum = 0;	//	작은숫자와 큰수의 합계

			//	System.out.println("Start >>");
				System.out.print("범위의 숫자중 작은 숫자 : ");
				startNum = scanner.nextInt();
			//	System.out.println("num1 >>");


				System.out.print("범위의 숫자중 큰 숫자 : ");
				endNum = scanner.nextInt();
			//	System.out.println("num2 / (num1, num2)가 EvenOdd로 >>");

				sum = evenOdd.sumCalc(startNum, endNum);
				System.out.println(startNum + " ~ " + endNum + "까지의 합계 : " + sum);
				System.out.println(evenOdd.evenOdd(sum));
			}

		
	}


