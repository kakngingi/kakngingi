package com.javalec.base;

import java.util.ArrayList;

import com.javalec.model.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList
		User user = null;
		ArrayList<User> arrayList = new ArrayList<User>();
		
		arrayList.add(new User("a", "111", "서울", "010-1111-2222"));
		System.out.println(arrayList.get(0).getId());
		System.out.println(arrayList.get(0).getPw());
		System.out.println(arrayList.get(0).getAddress());
		System.out.println(arrayList.get(0).getPhone());
		
		
		
		
	}
}
