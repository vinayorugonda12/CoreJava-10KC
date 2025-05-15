package com.bankapp;

public class BankAccount {
	
	private static String bankName="10kCoders";
	
	private long accountNumber;
	private  String ifscCode;
	private double balance=1000;
	private String initial;
	private String fName;
	private String lName;
	private String type;
	private long phoneNumber;
	private String email;
	private int pinCode;
	private int atmPin;
	
	
	public BankAccount(long accountNumber, String ifscCode, int balance, String initial, String fName, String lName,
			String type, long phoneNumber, String email, int pinCode,int atmPin) {
		
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.balance = balance;
		this.initial = initial;
		this.fName = fName;
		this.lName = lName;
		this.type = type;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.pinCode = pinCode;
		this.atmPin=atmPin;
	}


	public static String getBankName() {
		return bankName;
	}


	

	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getInitial() {
		return initial;
	}


	public void setInitial(String initial) {
		this.initial = initial;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPinCode() {
		return pinCode;
	}


	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public int getAtmPin() {
		return atmPin;
	}
	
	
	public void setAtmPin(int atmPin) {
		this.atmPin=atmPin;
		
	}



	public String displayDetails() {
		return "BankAccount [accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", balance=" + balance
				+ ", initial=" + initial + ", fName=" + fName + ", lName=" + lName + ", type=" + type + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", pinCode=" + pinCode +",atmPin="+atmPin+ "]";
	}
	

}
