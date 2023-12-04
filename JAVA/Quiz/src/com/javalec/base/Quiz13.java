package com.javalec.base;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// 배열의 삽입
		Scanner sc = new Scanner(System.in);
		int cnt = 0; // 입력갯수
		int[] number; // 입력 저장 배열
		int position = 0; // 삭제 숫자 위치

		System.out.print("입력할 숫자의 갯수 :");
		cnt = sc.nextInt();
		number = new int[cnt + 1];

		System.out.println(cnt + "개의 숫자를 입력하세요!: ");

		for (int i = 0; i < cnt; i++) {
			System.out.print((i + 1) + "의 숫자 : ");
			number[i] = sc.nextInt();

		}
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? : ");
		position = sc.nextInt();

		for (int i = cnt - 1; i >= position - 1; i--) {
			number[i + 1] = position;
		}

		System.out.println("-----결과-----");
		for (int i = 0; i < cnt + 1; i++) {
			System.out.println(String.format("%3d", number[i]));
		}

	}
}
