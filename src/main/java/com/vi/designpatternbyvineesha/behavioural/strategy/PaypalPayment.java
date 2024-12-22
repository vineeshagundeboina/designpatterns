package com.vi.designpatternbyvineesha.behavioural.strategy;

public class PaypalPayment implements PaymentStrategy{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("making the payment of "+amount+" by using paypal");
		
	}

}
