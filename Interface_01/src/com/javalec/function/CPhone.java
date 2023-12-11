package com.javalec.function;

import com.javalec.model.SmartPhone;

public class CPhone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
		System.out.println("C Phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
		System.out.println("C Phone : 4G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("C Phone : Not Applied");
	}

}
