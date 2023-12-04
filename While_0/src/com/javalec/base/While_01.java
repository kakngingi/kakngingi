package com.javalec.base;

public class While_01 {

	public static void main(String[] args) {
		// 1부터 100까지의 합계 구하기
		
		int i = 1;
		int tot = 0;
		
//		while(i <= 100) {
//			System.out.println(i);
//			i++;
//			
//		}
		while(true) {
			System.out.println(i);
			tot += 1;
			i++;
			if(i > 100) {
				break;
			}
		}
		System.out.println(tot);
	}

}
