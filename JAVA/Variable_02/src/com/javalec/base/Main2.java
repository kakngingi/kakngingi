package com.javalec.base;

public class Main2 {

	public static void main(String[] args) {
		
		// 연산자 종류별 출력
		int num1 = 10;
		int num2 = 2;
		int num3 = 5;
		
		System.out.println("<<< 산술 연산자 >>>");
		System.out.println("덧셈 :" + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("뺼셈 :" + num1 + " - " + num2 + " = " + (num1-num2));
		System.out.println("곱셈 :" + num1 + " * " + num2 + " = " + (num1*num2));
		System.out.println("나눗셈 몫 :" + num1 + " / " + num2 + " = " + (num1/num2));
		System.out.println("나눗셈 나머지 :" + num1 + " % " + num2 + " = " + (num1%num2));
		
		System.out.println("<<< 자동 증감 연산자 >>>");
		// num1 = num1 + 1;
		// num1 += 1;
		num1++; 
		System.out.println("증가 :" +num1);
		// num1 = num1 - 1;
		// num1 -= 1;
		num1--;
		System.out.println("감소 :" +num1);
		// 누적한다
		
		System.out.println("<<< 동등 비교 관계 연산자 >>>");
		System.out.println("num1 == num2 :" + (num1==num2));
		System.out.println("num1 != num2 :" + (num1!=num2));
		System.out.println("num1 > num2 :" + (num1>num2));
		System.out.println("num1 < num2 :" + (num1<num2));
		System.out.println("num1 <= num2 :" + (num1>=num2));
		System.out.println("num1 >= num2 :" + (num1<=num2));
		// true or false 만 출력됨
		// == 같은지를 묻는수식 비교할떄사용 
		// != 같지않냐인지를 묻는 수식
		// = 결과값을 도출해냄
		// > < 크냐 작냐	
		// <= >= 작거나 같냐 크거나같냐 (=> =< 함수가 있기때문에 앞에 방법으로 수식어 사용)
		
		System.out.println("<<< 논리 연산자 >>>");
		/*
		 true && true => true
		 true && false => false
		 false && true => false
		 false && false => false
		 */
		System.out.println("num1 > num2 && num2 > num3 :" + ((num1>num2) && (num2>num3)));
		// and 조건이면 두가지중 한가지가 true 이더라도 무조건 false 이다
		// and 둘 다 트루일 때 트
		/*
		 true || true => true
		 true || false => true
		 false || true => true
		 false || false => false
		 */
		System.out.println("num1 > num2 || num2 > num3 :" + ((num1>num2) || (num2>num3)));
		// or 조건이면 두가지중 한가지가 true 이더라도 무조건 true 이다 
		
		System.out.println("<<< 삼항 연산자 >>>");
		// 7이 3의 배수인지 판단
		System.out.println("7이 3의 배수인가? :" + (7 % 3 == 0 ? "3의배수" : "3의배수 아님"));
		String result = (7 % 3 == 0 ? "3의배수" : "3의배수 아님");
		System.out.println(result);
		
		
		/*
		 등록된 ID : abcd
		 등록된 Password : 1234
		 
		 입력된 ID : qwe
		 입력된 Password : 1234
		 
		 통과 :환영합니다 / 불통과 : id나 password를 다시 입력 하세요
		 */
		
//		1. 변수 만들기 a, b, c, d
//		2. a == c && b == d ? "" : ""
//		
//		
//		a = 등록된 아이디
//		b =  등록된 패스워
//		c = 입력된 아이디
//		d =   패스워드
		String aId = "abcd";
		String bpw = "1234";
		String cId = "qwe";
		String dpw = "1234";
//		System.out.println("7이 3의 배수인가? :" + (7 % 3 == 0 ? "3의배수" : "3의배수 아님"));
		System.out.println(aId == cId && bpw == dpw ? "환영합니다" : "id나 password를 다시 입력 하세요");
		
		/*
		 등록된 ID : qwe
		 등록된 Password : 4531
		 
		 입력된 ID : qwe
		 입력된 Password : 1234
		 
		 통과 :환영합니다 / 불통과 : id나 password를 다시 입력 하세요
		 */
		String aid = "qwe";
		String bid = "qwe";
		String cpw = "1234";
		String dPw = "1234";
		
		System.out.println(aid == bid && cpw == dPw ? "환영합니다" : "id나 password를 다시 입력 하세요");
		
		

		

		
	}

}
