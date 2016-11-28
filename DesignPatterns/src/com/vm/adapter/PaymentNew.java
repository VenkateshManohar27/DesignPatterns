package com.vm.adapter;

public class PaymentNew implements PaymentInterfaceNew {

	private String accNumber;
	private String cardNumber;
	private String otp;
	private int amt;
	
	

	public PaymentNew(String accNumber, String cardNumber, String otp, int amt) {
		super();
		this.accNumber = accNumber;
		this.cardNumber = cardNumber;
		this.otp = otp;
		this.amt = amt;
	}

	@Override
	public String getAccNumber() {
		// TODO Auto-generated method stub
		return accNumber;
	}

	@Override
	public String setCardNumber() {
		// TODO Auto-generated method stub
		return cardNumber;
	}

	@Override
	public String getOtp() {
		// TODO Auto-generated method stub
		return otp;
	}

	@Override
	public int getAmt() {
		// TODO Auto-generated method stub
		return amt;
	}

	@Override
	public void setAccNumber(String accno) {
		// TODO Auto-generated method stub
		this.accNumber = accno;
	}

	@Override
	public void setCardNumber(String cardno) {
		// TODO Auto-generated method stub
		this.cardNumber = cardno;
	}

	@Override
	public void otp(String password) {
		// TODO Auto-generated method stub
		this.otp = password;
	}

	@Override
	public void setAmt(int amount) {
		// TODO Auto-generated method stub
		this.amt = amount;
	}

	@Override
	public void complTransaction() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Transacting using new payment gateway");

				System.out.println("accountNumber: " + accNumber + " cardNumber " + cardNumber);
				System.out.println("otp: " + otp + " amount " + amt);
	}

}
