package com.qa.banking;

public class Bank {
	public static void main (String [] args) {
		BankAccount chris = new BankAccount();
		
		chris.setBalance(10);
		
		System.out.println(chris.getBalance());
	}

}
