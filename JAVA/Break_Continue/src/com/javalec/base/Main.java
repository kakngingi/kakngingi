package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1에서 100까지의 수중 10인 경우를 찾기!
//		for(int i=1; i<=100; i++) {
//			if(i==10) {
//				System.out.println("Find 10");
//				break; // 해당값을 찾으면 더이상 반복하지않음
//			}
//			System.out.println(i);
//		}

		
		for(int i=1; i<=10; i++) {
			if(i == 5) {
					continue; // 자연스럽게 이어서 출력되게해줌
			}
				System.out.println(i);
			
		}
	}

}
