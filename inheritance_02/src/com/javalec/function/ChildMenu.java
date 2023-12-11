package com.javalec.function;

public class ChildMenu extends ParentsMenu { // ParentsMenu를 상속받아옴.	

	// Field

	// Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}

	// Method
	public void makeBeefChung() {
		System.out.println("쇠고기 청국장");
	}

	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}

	public void makeKongNa() {
		//super.makeChung(); // 상속받은곳 패런츠의 데이터를 받아쓰는것! 위치는상관없다 
		System.out.println("콩나물국");
	}
	@Override // 상속받은거를 바꾸었다는 표시를 해줘야함! @기능을 꼭 붙여서 해줘야함
	public void makeChung() {
		super.makeChung(); // 상속받은곳 ParentsMenu의 데이터를 받아쓰는것!
		System.out.println("냄새없는 청국장");
	}
	
}
