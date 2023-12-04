package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 객체형 변수는 대문자시작 뒤에는 new가 붙는다
		// 화면에 출력되는것은 다 문자 숫자로 쳤어도 사실상 화면에는 나오는 숫자는 "4" 문자로 인식됨 숫자는 암호화가 안되기때문에 다 문자로 출력하여 암호화
		String 	str0 	= "가나다라마바";	// 객체형 변수타입 
		String	str1	= new String("abcdefg");	//	위랑 같은 타입
		String	str11	= new String("ABCDEFG");	//	위랑 같은 타입
		String	str2	= new String("HIJKLMN");	
		String	str3	= new String("   abc   ");	
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println(str1);	
		System.out.println(str1.concat(str2));	//	이어서 출력해줌
		System.out.println(str1.substring(3));	//	부분집합 입력한 정수의 위치에서부터 보여줌
		System.out.println(str1.substring(3,5));	//	부분집합 입력한 정수의 위치에서부터 위치전까지 보여줌
		
		//	라마만 출력하기
		System.out.println(str0.substring(3,5));
		System.out.println(str1.length());	
		System.out.println(str1.toUpperCase());	// 대소문자 구분안하고 다 대문자로 처리함
		System.out.println(str2.toLowerCase());	// 대소문자 구분안하고 다 문자로 처리함
		
		System.out.println(str1.charAt(3)); // 입력 배열의문자를 배열순번으로 출력
		System.out.println(str1.indexOf('d')); // 입력 문자가 배열의 몇번쨰에 있는지 출력
		
		System.out.println(str1.equals(str2));	// 	둘이 비교해서 똑같으면 true 다르면 flase	 	
		
		//	str1과 str11을 equals로 비교해서 true 값이 나오게 만들기!
		System.out.println(str1.equals(str11.toLowerCase()));	//	목적어(소문자)를 주어(대문자)	와 같은형태로 변경하여 비교.	
		
		System.out.println(str3.trim());	//	스페이스 없애줌(중요)	
		System.out.println(str1.replace('a', 'z'));	// '' 를 '' 으로 바꾸어줌
		System.out.println(str1.replaceAll("abc", "zzzzzz"));	// "" 의 문자열을 "" 의 문자열로 바꾸어줌
		
		
		
		

	}

}
