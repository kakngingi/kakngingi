package com.javalec.fucntion;

public class EvenOdd {
	public EvenOdd() {}
		public String evenOdd(int sum) {
			
			String result = "";	// 결과값
			
			if(sum % 2 == 0) {	//	짝수 홀수 조건문
				result = "짝수입니다.";
			}else {
				result = "홀수입니다.";
			}
			return result;
		
		
	}

}
