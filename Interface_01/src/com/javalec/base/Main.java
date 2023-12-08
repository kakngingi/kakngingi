package com.javalec.base;

import com.javalec.function.APhone;
import com.javalec.function.BPhone;
import com.javalec.function.CPhone;
import com.javalec.model.SmartPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone aPhone = new APhone();
		SmartPhone bPhone = new BPhone();
		SmartPhone cPhone = new CPhone();
		
		SmartPhone[] smartPhones = {aPhone, bPhone, cPhone};
		for(int i =0;i<smartPhones.length;i++) {
			smartPhones[i].callSenderReceiver();
			smartPhones[i].telMethod();
			smartPhones[i].tvRemoteController();
			System.out.println("-----------------------");
		}
		
	}

}
