package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 반복문
/*		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
	}
*/		
		// 1부터 10까지의 합계
//		int tot = 0;
//		for(int i=1; i<=10; i++) {
//			tot+=i;
//		}
//		System.out.println(tot);

		// 1부터 10까지의 홀수 만 출력
		int oddTot = 0;
		int oddTot2 = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				oddTot += i;
			}else
			if(i%2 == 0) {
				oddTot2 += i;
			}
		}
		System.out.println("홀수의 합 : " + oddTot);
		System.out.println("짝수의 합 : " + oddTot2);
		
		
		
	}

}
