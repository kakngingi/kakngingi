package com.javalec.base;

public class Mainquiz {

	public static void main(String[] args) {
		String result = "0"; // 결과값 변수
		String num = "";	// 곱해지는 숫자 변수
		long k = 1;	//	숫자의 값이 큰경우 int로 하면 오류가 나서 더 많이 표출할수있는 long 사용
		
		for(int i=0; i<=10; i++) {	//	조건 반복문 
			num = String.format("%2d", i);	//	변수의 출력값 재설정 (재설정값, 숫자값)
			result = String.format("%11d", k);	// 변수의 출력값 재설정 (재설정값, 숫자값) 
			k*=10;	//	k=k*10 k값 곱하기 10을 계속 누적해서 함
			System.out.println("10^" + num + " = " + result);
		}
//		k*=10;	//	k=k*10 k값 곱하기 10을 계속 누적해서 함
//		System.out.println("10^" + String.format("%2d", i) + " = " + String.format("%12d", k));
//	}
		
//		System.out.println();
//		System.out.print("\t");
//		System.out.printf();
//		for(int i=1; i<=9; i++) {
//			System.out.println("");
//		}
	}

}

