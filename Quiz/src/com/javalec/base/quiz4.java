package com.javalec.base;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {
		// 입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		Scanner scanner = new Scanner(System.in);	//	스캐너 생성
		int num = 0;	// 입력 변수값
		int tot = 0;	// 합계 변수값
		
		System.out.print("Enter an integer(0 ~ 9) : ");	//	입력 출력물 생성
		num = scanner.nextInt();	// 입력칸 생성
		while(num != 0) {	//	조건반복문 
			tot += num%10;	//	나머지 숫자들 합계 / ex) 123456%10 하면 12345.6 그럼 6더하고 밑으로가서
			num/=10;		// 	123456/10 하면 나머지값 없이 딱떨어짐 12345 로 올라가서 다시 반복문 실행
			
			
		}
		
		System.out.print("Sum of digits = " + tot);	// 나머지합계 출력물
	}
}
