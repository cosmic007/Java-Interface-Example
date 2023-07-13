package com.canddella.entity;

public class PlatinumSavingsAccount extends SavingsAccount implements Platinum {

	public PlatinumSavingsAccount(String accountNumber, String rateOfInterest) {
		super(accountNumber, rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		
	}

	public void getDiscount() {
		
		System.out.println("Initiating Discount for Platinum Savings Account");
		// TODO Auto-generated method stub
		
	}

	public void getCard() {
		
		System.out.println("Initiating Card for Platinum Savings Account");
		// TODO Auto-generated method stub
		
	}

}
