package com.javalec.function;

import com.javalec.model.SmartPhone;

public class BPhone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
		System.out.println("B Phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("B Phone : 4G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("B Phone : Applied");
	}

}
