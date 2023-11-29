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
		
		for(int i=0; i <= 200; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}

		
//		for(int i=1; i<=10; i++) {
//			if(i == 5) { 				// i는 5이므로 break 할경우 4까지만 출력되고 더이상 조건문이 반복되지 않는다.
//				continue;				//	하지만 continue가 있을경우 5를 제외한 다음숫자부터 자연스럽게 이어서 조건문의 최대값까지 출력된다 
//			}
//				System.out.println(i);
//			
//		}
	}

}
