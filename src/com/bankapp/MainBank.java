package com.bankapp;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		BankAccount bank1= new BankAccount(1234567890, "SBIN0RRDCGB", 20000, "O", "vinay", "Orugonda", "savings", 1234567890, "bank@gmail.com", 500043,630914);
		System.out.println("WELCOME To Bank!!!!");
		System.out.println("------------------------");
		System.out.print("Enter Pin:");
		int pin=sc.nextInt();
		
		if(pin==bank1.getAtmPin()) {
			System.out.println("Pin correct!!!");
			while(true) {
				System.out.println("-------------------");
				System.out.println("Choose one option:");
				System.out.println("1. Balance Enquriry");
				System.out.println("2.Widthdraw");
				System.out.println("3.Deposit");
				System.out.println("4.Pin Change");
				System.out.println("5.Change Mobile Number");
//				System.out.println("6.STOP");
				System.out.print("Key:");
				int key=sc.nextInt();
				
				switch(key) {
				
				case 1:{
					System.out.println("You have choosen 1. Balance Enquriry ");
					System.out.println("Balance: "+bank1.getBalance());
					break;
				}
				
				case 2:{
					System.out.println("You have choosen 2. Withdrawl ");
					System.out.print("Enter Amount to be drawn:");
					int amount=sc.nextInt();
					double remaining=bank1.getBalance()-amount;
					if(remaining>1000) {
						System.out.println("withdrawl successful!!");
						bank1.setBalance(remaining);
					}
					else {
						System.out.println("Insufficient Funds!!!");
						
					}
					break;

				}
				
				case 3:{
					System.out.println("You have choosen 3. Deposit cash ");
					System.out.print("Enter Amount To be deposited:");
					double deposit=sc.nextDouble();
					double total=deposit+bank1.getBalance();
					bank1.setBalance(total);
					System.out.println("deposited successfully!!!!");
					
					break;
					}
				case 4:{
					System.out.println("You have choosen 4. pin change ");
					System.out.print("enter previous pin:");
					int previousPin=sc.nextInt();
					if(previousPin==bank1.getAtmPin()) {
						System.out.print("Enter New PIN: ");
						int newPin=sc.nextInt();
						bank1.setAtmPin(newPin);
						System.out.println("Pin changed Successfully!!!!");
						break;
					}
				}
				case 5:{
					System.out.println("You have choosen 5.  change mobile number ");
					System.out.print("enter ATM pin:");
					int atmPin=sc.nextInt();
					if(atmPin==bank1.getAtmPin()) {
						System.out.print("Enter New mobile number : ");
						long newMobileNumber=sc.nextLong();
						bank1.setPhoneNumber(newMobileNumber);
						System.out.println("Number changed Successfully!!!!");
						break;
					}
					else {
						System.out.println("incorrect ATM pin entered!!!!!!");
					}
			
				  }
				
//				case 6:{
//					break;
//				}
				
				default:{
					System.out.println("invalid key !!   please enter valid key:");
					break;
				}
			
				
				
				
				}
				System.out.println("want to continue? true/false");
				boolean nextChoice=sc.nextBoolean();
				if(nextChoice) {
					continue;
				}
				else {
					break;
				}
		
				
			}
		}
		else {
			System.out.println("Incorrect ATM pin");
		}
			
		sc.close();
		
	}
		
//		System.out.println(bank1.displayDetails());

	}


