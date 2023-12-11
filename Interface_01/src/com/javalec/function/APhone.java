package com.javalec.function;

import com.javalec.model.SmartPhone;

public class APhone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
		System.out.println("A Phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("A Phone : 3G");

	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("A Phone : Not Applied");

	}

}
