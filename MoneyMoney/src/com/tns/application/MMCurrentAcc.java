package com.tns.application;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	//Constructor
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float amount) {
		super.withdraw(amount);
		System.out.println("Account Balance: " + getAccBal());	
	}
	
	
}
