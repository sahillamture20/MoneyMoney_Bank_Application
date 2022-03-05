package com.tns.framework;

public class CurrentAcc extends BankAcc {
	
	private float creditLimit;
	
	public float getCreditLimit() {
		return creditLimit;
	}
	
	//Constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float amount) { 
//		checking that user can withdraw amount given or not 
		if (getAccBal() > amount && (getAccBal() -  amount >= creditLimit)) 
		{
			setAccBal(getAccBal() - amount);
			System.out.println("Trasaction Successful.");
		}  else {
			System.out.println(amount+" cannot be witdraw. Because, your credit limit is "+creditLimit);
		}
	}

	@Override
	public String toString() {
		System.out.println("Your account Number is " + (getAccNo()));
		System.out.println("Your Account Balance is " + getAccBal() + " and Your Credit Limit is " + creditLimit);

		return "CurrentAcc []";
	}
	
}
