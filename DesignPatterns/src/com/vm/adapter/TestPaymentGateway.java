package com.vm.adapter;

public class TestPaymentGateway {
	public static void main(String[] args) {
		PaymentInterfaceBefore pib = new PaymentBefore("1", "897 7817 8719 2788", "9877", 1000);
		pib.completeTransaction();
		// The payment gateway should use new interface
		
	}

}
