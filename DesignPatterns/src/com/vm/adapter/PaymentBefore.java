package com.vm.adapter;

public class PaymentBefore implements PaymentInterfaceBefore {
	private String accountNumber;
	private String cardNumber;
	private String otp;
	private int amount;

	public PaymentBefore(String accountNumber, String cardNumber, String otp, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.cardNumber = cardNumber;
		this.otp = otp;
		this.amount = amount;
	}

	@Override
	public void setAccountNumber(String accno) {
		// TODO Auto-generated method stub
		this.accountNumber = accno;

	}

	@Override
	public void setDebitCardNumber(String cardno) {
		// TODO Auto-generated method stub
		this.cardNumber = cardno;
	}

	@Override
	public void otp(String password) {
		// TODO Auto-generated method stub
		this.otp = password;
	}

	@Override
	public void setAmount(int amount) {
		// TODO Auto-generated method stub
		this.amount = amount;
	}

	@Override
	public void completeTransaction() {
		// TODO Auto-generated method stub
		System.out.println("Transacting using old payment gateway");

		System.out.println("accountNumber: " + accountNumber + " cardNumber " + cardNumber);
		System.out.println("otp: " + otp + " amount " + amount);

	}

	@Override
	public String getAccountNumber() {
		// TODO Auto-generated method stub
		return accountNumber;
	}

	@Override
	public String setDebitCardNumber() {
		// TODO Auto-generated method stub
		return cardNumber;
	}

	@Override
	public String getOtp() {
		// TODO Auto-generated method stub
		return otp;
	}

	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return amount;
	}

}
