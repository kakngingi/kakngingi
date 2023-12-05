package com.javalec.base;

import java.util.Scanner;

public class opp_00 {

	public static void main(String[] args) {
// 메인은 출력 클라스는 계산기능 
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int startNum = 0;
		int endNum = 0;
		
		System.out.print("범위의 숫자중 작은 숫자 : ");
		startNum = scanner.nextInt();
		System.out.print("범위의 숫자중 큰 숫자 : ");
		endNum = scanner.nextInt();

		for (int i = startNum; i <= endNum; i++) {
			sum += i;

		}
		System.out.println(startNum + " ~ " + endNum + "까지의 합계 : " + sum);

		if (sum % 2 == 0) {
			System.out.print("짝수입니다.");
		} else {
			System.out.print("홀수입니다.");

		}

	}

} 
