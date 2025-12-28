package com.oops.abstraction;

public class ClientPaymentMethod {

	public static void main(String[] args) {
		
		PaymentProcessor processor = new PaymentProcessor();
		
		PaymentMethod credit = new CreditCardPayments(1000);
		processor.process(credit);
		
		System.out.println("------------------------------------");
		
		PaymentMethod net = new NetBankingPayment(2000);
		processor.process(net);
		
		System.out.println("------------------------------------");
		
		PaymentMethod upi = new UPIPayments(3000);
		processor.process(upi);

	}

}
