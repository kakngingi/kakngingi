package com.javalec.base;

import java.util.Scanner;

public class KMain {

	public static void main(String[] args) {
		// 덧셈 시작 수를 입력하세요 : 10
		// 덧셈 끝 수를 입력하세요 : 1	
		
		// 결과 :
		// 1) 숫자의 총합은 _이며 평균은_.	
		// 2) 홀수의 총합은 _이며 평균은_.	
		// 3) 짝수의 총합은 _이며 평균은_.	
		
		// 반복문 사용
		// 스캐너 생성 Property, Attribute, Field
		Scanner scanner = new Scanner(System.in);
		
		//입력받을 변수, 합계, 평균, 카운트
		int num1 = 0; int firstNum = 0; // 시작 숫자
		int num2 = 0; int secondNum = 0;// 끝 숫자
		int tot = 0;        			// 총합
		int totCnt = 0;					// 총합 횟수
		int oddTot = 0;        			// 홀수 총합
		int oddTotCnt = 0;				// 홀수 총합 횟수
		int evenTot = 0;				// 짝수 총합
		int evenTotCnt = 0;				// 짝수 총합 횟수
		//입력 받기
		System.out.print("덧셈 시작 수를 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("마지막 수를 입력 : ");
		num2 = scanner.nextInt();
		
		// 시작숫자와 끝숫자를 비교해서 시작과 끝을 정렬하자!
		if(num1 > num2) {
			firstNum = num2;
			secondNum = num1;
		}
		else {
			firstNum = num1;
			secondNum = num2;	
		}
		
		// 숫자의 총합 구하기
		for(int i=firstNum; i<=secondNum; i++) {
			tot += i; 	// 숫자의 총합 구하기
			totCnt++;	// 숫자의 횟수 구하기
			if(i % 2 == 0) {	// 홀수인 경우
				oddTot += i;	// 홀수의 총합
				oddTotCnt++;	// 홀수의 횟수
			}
			else {				// 짝수인 경우
				evenTot += i;	// 짝수의 총합
				evenTotCnt++;	// 짝수의 횟수
			}
		}
		
			
		// 출력하기
		System.out.println("결과 : ");
		System.out.println("1)숫자의 총합은 " + tot + "이며 평균은 " + ((double)tot/totCnt));
		System.out.println("2)홀수의 총합은 " + oddTot + "이며 평균은" + ((double)oddTot/oddTotCnt));
		System.out.println("3)짝수의 총합은 " + evenTot + "이며 평균은" + ((double)evenTot/evenTotCnt));
		
				
					
				
				
				
				
			
		
		
		
		
		
	}
	

}
