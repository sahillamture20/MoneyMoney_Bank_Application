package com.tns.application;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	private static final float MINBAL = SavingAcc.getMinbal();
	
	public static float getMinbal() {
		return MINBAL;
	}
	
	//Constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float amount) {
		super.withdraw(amount);
		System.out.println("Account Balance: " + getAccBal());
	}
	
}
