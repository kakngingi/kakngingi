package com.javalec.base;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
/*	9번 퀴즈
	학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가하세요
		 
		Korean의 성적을 입력 : 
		No1의 성적은 : 11
		No2의 성적은 : 12
		No3의 성적은 : 13
		No4의 성적은 : 14
		English의 성적을 입력 : 
		No1의 성적은 : 11
		No2의 성적은 : 12
		No3의 성적은 : 13
		No4의 성적은 : 14
		Mathematics의 성적을 입력 : 
		No1의 성적은 : 11
		No2의 성적은 : 12
		No3의 성적은 : 13
		No4의 성적은 : 14
		     Korean  English Mathematics      Total  Average
		No1		11		11 		11				33		11
		No2	 	12		12 		12				36		12
		No3	 	13		13 		13				39		13
		No4	 	14		14 		14				42		14
*/

		Scanner scanner = new Scanner(System.in);
		String[] name = { "No1", "No2", "No3", "No4" };	//	배열에 이름값 작성
		int[] kgd = new int[4]; // 4명의 국어 점수값 배열
		int[] egd = new int[4]; // 4명의 영어 점수값 배열
		int[] mgd = new int[4]; // 4명의 수학 점수값 배열
		int[] total = new int[4]; // 4명의 3과목 합계점수값 배열

		System.out.println("Korean의 성적을 입력 : ");
		for (int i = 0; i < name.length; i++) { // 반목문 생성 (초기값,조건값,증가)
			System.out.print(name[i] + "의 성적은 : ");
			kgd[i] = scanner.nextInt(); // 점수 입력칸 생성

		}
		System.out.println("English의 성적을 입력 : ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 성적은 : ");
			egd[i] = scanner.nextInt();

		}
		System.out.println("Mathematics의 성적을 입력 : ");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "의 성적은 : ");
			mgd[i] = scanner.nextInt();

			total[i] = kgd[i] + egd[i] + mgd[i];	// 3과목의 점수 합계값
		}

		System.out.println("     Korean  English Mathematics      Total  Average");
		for (int i = 0; i < name.length; i++) { 
			System.out.println(
					name[i] + "\t" + kgd[i] + "\t" + egd[i] + " \t" + mgd[i] + "\t\t" + total[i] + "\t" + total[i] / 3);	// 과목별 점수 3과목 합계 평균값

		}

	}

}