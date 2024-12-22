package com.vi.designpatternbyvineesha.behavioural.strategy;

public class PaymentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentContext p=new PaymentContext(new CreditCardPayment());
		
		p.pay(120.45);
		
		p.setPaymentStrategy(new PaypalPayment());
		p.pay(500.34);
		
		p.setPaymentStrategy(new BankTransferPayment());
		p.pay(376.89);

	}

}
