package com.javalec.function;

public class Shop2 extends Shop1 {
	// Field
	
	// Constructor
	public Shop2() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	@Override
	public void makeKimchi() {
		System.out.println("김치찌개(HQ) : 5,000원");
	}
	@Override
	public void makeBibim() {
		System.out.println("비빔밥 : 5,000원");
	}
	@Override
	public void makeSundea() {
		System.out.println("순대국 : 4000원");
	}@Override
	public void makeRise() {
		System.out.println("공기밥 : 무료입니다.	");
}
}

