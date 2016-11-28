package com.vm.adapter;

public interface PaymentInterfaceNew {

	public String getAccNumber();
	public String setCardNumber();
	public String getOtp();
	public int getAmt();
	public void setAccNumber(String accno);
	public void setCardNumber(String cardno);
	public void otp(String password);
	public void setAmt(int amount);
	public void complTransaction();
}
