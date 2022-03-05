package com.tns.framework;

public class SavingAcc extends BankAcc {

	private boolean isSalaried;
	
	public boolean isSalaried() {
		return isSalaried;
	}
	
	private static final float MINBAL = 1000;
	
	public static float getMinbal() {
		return MINBAL;
	}

	//Constructor
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	//Withdraw method
//	checking that user can withdraw amount given or not
	public void withdraw(float amount) {
		if (isSalaried && getAccBal() > amount && (getAccBal() - amount >= MINBAL)) {
			setAccBal(getAccBal() - amount);
			System.out.println("Trasaction Successful.");
		} else {
			System.out.println(amount+" cannot be withdraw. Because, your credit limit is "+MINBAL);
		}
	}

	@Override
	public String toString() {
		System.out.println(super.toString());
		System.out.println("Your account Number is " + (getAccNo()) + " & Your Account Balance is " + getAccBal());

		return "\n";
	}


}
