package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Apple", "사과");
		hashMap.put("Banana", "바나나");
		
		System.out.println(hashMap);	//	전체 출력
		System.out.println(hashMap.get("Apple"));	// 키의 Apple	 값 얻기
		
		hashMap.put("Apple", "Apple");	// Apple의 값 사과에서 Apple로 넣기
		System.out.println(hashMap);
		
		hashMap.remove("Apple"); // 키 값 제거
		System.out.println(hashMap);
		
		hashMap.clear();	// 모든 값 제거
		System.out.println(hashMap);
		
		
		
	}

}
