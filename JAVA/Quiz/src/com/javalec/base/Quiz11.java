
package com.javalec.base;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
/*	11번 퀴즈
	몇 개의 숫자를 입력 할지 결정한 후 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악하
	
		입력할 숫자의 갯수 ? : 4
		4개의 숫자를 입력하세요
		1의 숫자 : 11
		2의 숫자 : 22
		3의 숫자 : 33
		4의 숫자 : 44
		검색할 숫자는? : 33
		33의 위치는 3번째 입니다.
 */
		Scanner scanner = new Scanner(System.in);

		int cnt = 0; // 숫자 위치를 찾기위한 카운트값

		System.out.print("입력할 숫자의 갯수 ? : ");
		int num = scanner.nextInt(); // 입력할 숫자 갯수 입력칸
		int[] group = new int[num];

		System.out.println(num + "개의 숫자를 입력하세요"); // 출력문 생성
		for (int i = 0; i < num; i++) { // 반복문으로 조건 생성 (기본값,조건값,증가)
			System.out.print(i + 1 + "의 숫자 : "); // 출력문 생성
			int num2 = scanner.nextInt(); // 숫자 입력칸
			group[i] = num2;	//	배열에 입력 숫자 지정
		}
		System.out.print("검색할 숫자는? : "); // 출력문 생성
		int search = scanner.nextInt(); // 검색할 숫자 입력칸

		for (int i = 0; i < group.length; i++) {
			if (group[i] == search) {	//	배열에 있는 숫자와 찾는값 비교후 트루면 출력 거짓이면 카운트 증가로
				System.out.println(search + "의 위치는 " + (i+1) + "번째 입니다.");
			} else {

				cnt++;	// 카운트 증가
			}
		}

		if (cnt == group.length) {	// i값 이상의 번호에는 배열값이 없기떄문에 찾을수없음
			System.out.println(search + "는 존재하지 않습니다.");	

		}

	}
}