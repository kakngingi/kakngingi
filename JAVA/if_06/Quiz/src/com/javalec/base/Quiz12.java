package com.javalec.base;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		//

		Scanner scanner = new Scanner(System.in);


		System.out.print("입력할 숫자의 갯수? : ");
		int num = scanner.nextInt(); 
		int[] agroup = new int[num];	// 배열값 지정
		int[] bgroup = new int[num+1];	//  결과값 배열 +1을 왜넣는지 모르겠음..

		System.out.println(num + "개의 숫자를 입력하세요!"); 
		for (int i = 0; i < num; i++) { // 반복문으로 조건 생성 (기본값,조건값,증가)
			System.out.print(i + 1 + "의 숫자 : "); 
			int num2 = scanner.nextInt(); 
			agroup[i] = num2; // 배열에 입력 숫자 지정
		}
		System.out.print("숫자를 삽입하고자 하는 위치는 ? :"); 
		int	ilct = scanner.nextInt();	//	삽입 숫자값 위치
		System.out.print("삽입하고자 하는 숫자는? :");
		int	inum = scanner.nextInt();	// 삽입 숫자값

		System.out.println("-------- 결과 --------");
		for (int i = 0, cnt = 0; i < agroup.length; i ++) {	//	삽입하고자하는 위치를 구하기위한 조건문
			if ( ilct == i + 1) {	//			여기서부터는 이해가 안됨..
				cnt ++;				
			}
			bgroup[cnt] = agroup[i];
			cnt++;
			
		}
		for (int i = 0; i < bgroup.length; i ++) {				
			System.out.println(bgroup[i]);
			}
			
		}
	}

