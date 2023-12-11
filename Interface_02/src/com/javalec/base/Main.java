package com.javalec.base;

import com.javalec.function.PoliceMan;
import com.javalec.function.XMan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("X-Man의 역할");
		XMan xman = new XMan();
		xman.catchFire();
		xman.saveMen();
		xman.catchThief();
		xman.findThing();
		xman.makePizza();
		xman.makeSpaghetti();
		System.out.println("-----------------------");
		
		
		System.out.println("경찰역할");
		PoliceMan policeMan = new XMan(); // 다형성 클라스에 생성자를 가져와서 폴리스의 기능만 추려내어 사용할수있다.
		policeMan.catchThief();
		policeMan.findThing();

	}

}
