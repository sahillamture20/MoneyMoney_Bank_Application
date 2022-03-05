package com.tns.application;

import java.util.Scanner;

import com.tns.framework.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
				int accNo = 110;
				String accNm = "default";
				float accBal = 10000;
				boolean isSalaried = false;
				float creditLimit = 5000;
				float amt = 0;

				//Previous Objects
				MMCurrentAcc mcAcc = new MMCurrentAcc(0371, "Sahil", accBal, creditLimit);
				MMSavingAcc msAcc = new MMSavingAcc(0021, "Rahil", accBal, true);

				System.out.println("$$$$$$$$$$$$$$ WELCOME  TO $$$$$$$$$$$$$$$");
				welcome();
				System.out.println("PRESS 1 OR 2 :");
				System.out.println("1. CREATE NEW ACCOUNT"+"\n2"+". LOGIN");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:// Create new Account
					//Username
					System.out.println("Enter Your Name:");
					accNm = sc.next();
					//Account Type:
					System.out.println("Choose the account type you want to Create");
					System.out.println("1. Saving"+"\n"+"2. Current"+"\n"+"Enter your option:");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						// Saving Account
						accBal = 0;
						System.out.println("Do you want this account as your Salary Account ?");
						System.out.println("1. Yes"+"\n"+"2. No"+"\n"+"Enter your option:");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							isSalaried = true;
							break;
						case 2:
							isSalaried = false;
							break;

						default:
							System.out.println("Invalid Output");
							break;
						}

						System.out.println("Your Account balance must be minimum Rs.1000");
						System.out.println("Enter Amount:");
						accBal = sc.nextFloat();
						while (accBal < msAcc.getMinbal()) {
							if (accBal < msAcc.getMinbal()) {
								System.out.println("To match the required minimum balance, Please pay Remaining Amount " + (msAcc.getMinbal() - accBal));
								System.out.println("Enter Amount:");
								accBal = accBal + sc.nextFloat();
							}
						}
						//SAVING ACCOUNT Object Creation
						SavingAcc sAccNew = new MMSavingAcc(++accNo, accNm, accBal, isSalaried);
						System.out.println(sAccNew.toString());
						welcome();
						System.out.println("1. Deposite"+"\n"+"2. Withdraw"+"\n"+"3. Exit");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							sAccNew.deposite(amt);
							break;
						case 2:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							sAccNew.withdraw(amt);
							break;
						case 3:
							System.out.println("Logout Successfully");
							break;

						default:
							System.out.println("Invalid Option");
							break;
						}
						break;
					case 2:
						// Current Account
						accBal = 0;

						System.out.println("Your Account balance must be minimum Rs.5000");
						System.out.println("Enter Amount:");
						accBal = sc.nextFloat();
						while (accBal < 5000) {
							if (accBal < 5000) {
								System.out.println("To match the credit limit, Please pay Remaining Amount " + (5000 - accBal));
								System.out.println("Enter Amount:");
								accBal = accBal + sc.nextFloat();
							}
						}

						//CURRENT ACCOUNT Object Creation
						MMCurrentAcc cAccNew = new MMCurrentAcc(accNo++, accNm, accBal, creditLimit);
						cAccNew.toString();

						welcome();
						System.out.println("1. Deposite"+"\n"+"2. Withdraw"+"\n"+"3. Exit");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							cAccNew.deposite(amt);
							System.out.println("CREDIT LIMIT: " + "Rahil");
							break;
						case 2:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							cAccNew.withdraw(amt);
							break;
						case 3:
							break;

						default:
							System.out.println("Invalid Option");
							break;
						}
						break;

					default:
						System.out.println("Invalid Option");
						break;
					}

					break;

				case 2:
					// Login
					System.out.println("Enter Account Number:");
					int accNochoice = sc.nextInt();
					if (accNochoice == 105) {
						//Previous Code of Saving Account implementation
						System.out.println("Welcome ".toUpperCase() + msAcc.getAccNm());
						welcome();
						System.out.println("1. Deposite"+"\n"+"2. Withdraw"+"\n"+"3. Exit");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							msAcc.deposite(amt);
							break;
						case 2:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							msAcc.withdraw(amt);
							break;
						case 3:
							System.out.println("Logout Successfully ");
							break;

						default:
							System.out.println("Invalid Option");
							break;
						}
						break;
					} else if (accNochoice == 101) {
						//Previous Code of Current Account implementation
						System.out.println("Welcome ".toUpperCase() + mcAcc.getAccNm());
						welcome();
						System.out.println("1. Deposite"+"\n"+"2. Withdraw"+"\n"+"3. Exit");
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							mcAcc.deposite(amt);
							System.out.println("CREDIT LIMIT: " + mcAcc.getCreditLimit());
							break;
						case 2:
							System.out.println("Enter Ammount:");
							amt = sc.nextFloat();
							mcAcc.withdraw(amt);
							break;
						case 3:
							break;

						default:
							System.out.println("Invalid Option");
							break;
						}
						break;

					} else
						System.out.println("Wrong Account Number, Please check again...");

					break;

				default:
					System.out.println("Invalid Option");
					break;
				}

			}
			static public void welcome() {
				System.out.println("**********************************************");
				System.out.println("$$$$$$$$$$$ MoneyMoney BANK $$$$$$$$$$$$$");
				System.out.println("**********************************************");
	}

}

