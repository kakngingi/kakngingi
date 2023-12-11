package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 에외처리
		
		int i =10;
		int j = 0;
		
		System.out.println("Add : " + (i+j));
		System.out.println("Sub : " + (i-j));
		System.out.println("Mul : " + (i*j));
		
		
	
		try {	// 시도해서 이상이없으면 진행하는거고
			System.out.println("div : " + (i/j));
		}catch(Exception e) {	// 이상이있어서 내려오면 아래 문자출력
//			e.printStackTrace();
			System.out.println("숫자를 다시한번 확인하세요");		
		}finally {
			
		}
		
	
	}

}
