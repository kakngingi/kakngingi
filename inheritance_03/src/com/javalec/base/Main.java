package com.javalec.base;

import com.javalec.function.HQ;
import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HQ hq = new HQ();
		Shop1 shop1 = new Shop1();
		Shop2 shop2 = new Shop2();
		Shop3 shop3 = new Shop3();
		
		System.out.println("HQ------------");
		hq.makeKimchi();
		hq.makeBudea();
		hq.makeBibim();
		hq.makeSundea();
		hq.makeRise();
		System.out.println();
		
		System.out.println("Shop1------------");
		shop1.makeKimchi();
		shop1.makeBudea();
		shop1.makeBibim();
		shop1.makeSundea();
		shop1.makeRise();
		System.out.println();
		
		System.out.println("Shop2------------");
		shop2.makeKimchi();
		shop2.makeBudea();
		shop2.makeBibim();
		shop2.makeSundea();
		shop2.makeRise();
		System.out.println();
		
		System.out.println("Shop3------------");
		shop3.makeKimchi();
		shop3.makeBudea();
		shop3.makeBibim();
		shop3.makeSundea();
		shop3.makeRise();

	}

}
