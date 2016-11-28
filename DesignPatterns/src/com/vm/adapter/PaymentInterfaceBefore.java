package com.vm.adapter;

public interface PaymentInterfaceBefore {

	public String getAccountNumber();
	public String setDebitCardNumber();
	public String getOtp();
	public int getAmount();
	public void setAccountNumber(String accno);
	public void setDebitCardNumber(String cardno);
	public void otp(String password);
	public void setAmount(int amount);
	public void completeTransaction();
}
