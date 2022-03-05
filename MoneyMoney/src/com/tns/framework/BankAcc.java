package com.tns.framework;

public class BankAcc {

	//Different required variables
	private int accNo;
	private String accNm;
	private float accBal;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	//Constructor
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
		
		public void withdraw(float amount) {}
		
		public void deposite(float amount) {
			accBal += amount;
			System.out.println(amount + " is successfully deposited");
			System.out.println("Trasaction Successful.");
			System.out.println("Current BALANCE: " + getAccBal());
		
		}

		@Override
		public String toString() {
			return (accNm + " your Account is Created.");
		}
	
}
