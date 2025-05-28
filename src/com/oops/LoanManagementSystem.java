package com.oops;

import java.util.Scanner;

public class LoanManagementSystem {
	
	private String customerName;
	private double loanAmount;
	private double interestRate;
	private int loanTerm;
	private double outstandingBalance;

	public LoanManagementSystem(String customerName, double loanAmount, double interestRate, int loanTerm,
			double outstandingBalance) {
//super();
		this.customerName = customerName;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.loanTerm = loanTerm;
		this.outstandingBalance = outstandingBalance;
		System.out.println("Loan Application Submitted");
	}
	
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(int loanTerm) {
		this.loanTerm = loanTerm;
	}

	public double getOutstandingBalance() {
		return outstandingBalance;
	}

	public void setOutstandingBalance(double outstandingBalance) {
		this.outstandingBalance = outstandingBalance;
	}
	
	
	
	public void makePayment(double amount) {
		
		if(amount<=0) {
			System.out.println("Invalid Payment amount");
		}
		else if(amount>getOutstandingBalance()) {
			System.out.println("Payment exceeds loan balance");
		}
		else {
			double balance=getOutstandingBalance()-amount;
			setOutstandingBalance(balance);
		}
		
		
	}
	
	
	
	public void calculateEMI() {
		double emi=(loanAmount*interestRate*Math.pow(1+interestRate, loanTerm))/Math.pow(1+interestRate, loanTerm);
		System.out.println("emi amount is : "+emi);
		
		
	}
	
	public void displayLoanDetails() {
		System.out.println("loan amount : "+getLoanAmount());
		System.out.println("Intrest rate : "+getInterestRate());
		calculateEMI();
		System.out.println("balance :"+getOutstandingBalance());
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("welcome to loan appliction");
		
		
		
		LoanManagementSystem l=new LoanManagementSystem("devaraj", 10000, 2, 1, 20000);
//		l.makePayment(10000);
//		l.displayLoanDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.show balance");
		System.out.println("2.make payment");
		System.out.println("3.calculate EMI");
		System.out.println("4.display loan details");
		System.out.println("5.exit");
		
		while(true) {
			System.out.println("enter key:");
			int key=sc.nextInt();
			
			switch(key) {
			case 1:{
				System.out.println("outstanding balance is : "+ l.getOutstandingBalance());
				break;
			}
			case 2:{
				System.out.println("making payment...");
				System.out.println("enter amount: ");
				int amount =sc.nextInt();
				l.makePayment(amount);
				System.out.println("done!!");
				break;
			}
			case 3:{
				l.calculateEMI();
				break;
				
			}
			case 4:{
				l.displayLoanDetails();
				break;
				
			}
			
			default :{
				System.out.println("invalid key...");
				
			}
			
			
			}
			
			System.out.println("want to continue? true/false");
			boolean nextChoice=sc.nextBoolean();
			if(nextChoice) {
				continue;
			}
			else {
				System.out.println("thank you visit again");
				break;
			}
			
		}
		sc.close();
	
		
		

	}
	

}
