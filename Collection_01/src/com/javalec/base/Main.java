package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		ArrayList<String> arrayList = new ArrayList<String>(); // 가상 메모리 배열선언
		
		arrayList.add("str4");
		arrayList.add("str3");
		arrayList.add("str2");
		arrayList.add("str1");
		// 데이터 크기에 상관없이 순서대로 출력됨
		System.out.println(arrayList);	// 배열출력
		System.out.println(arrayList.size());	// 배열크기
		
		for(int i=0; i<arrayList.size(); i++) {	// 조건문
			System.out.println(arrayList.get(i));
		}
		// 가져오기
		System.out.println(arrayList.get(3));
		
		// 수정
		arrayList.set(3, "str111");
		System.out.println(arrayList);
		
		// 삭제
		arrayList.remove(1);
		System.out.println(arrayList);
		
		
		arrayList.add("str4");
		arrayList.remove("str4");
		System.out.println(arrayList.remove("AAAA")); // 참 거짓 판별 있으면 참 없으면 거짓
		System.out.println(arrayList);
		
		arrayList.add(0,"AAA");	//	0번 키에 AAA값 추가하기
		System.out.println(arrayList);
		
		arrayList.clear();	// 모든값 제거
		System.out.println(arrayList);
	}

}
