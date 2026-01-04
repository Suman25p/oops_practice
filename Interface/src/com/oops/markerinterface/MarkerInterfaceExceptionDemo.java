package com.oops.markerinterface;
//Marker Interface
interface Retryable
{
	
}

class NetworkException extends Exception implements Retryable
{
	NetworkException(String message) {
        super(message);
    }
}

class InvalidInputException extends Exception {
    InvalidInputException(String message) {
        super(message);
    }
}

class PaymentService {

    static void processPayment(int amount) throws Exception {

        if (amount <= 0) {
            throw new InvalidInputException("Invalid payment amount");
        }

        if (amount > 5000) {
            throw new NetworkException("Network issue occurred");
        }

        System.out.println("Payment processed successfully");
    }
}

public class MarkerInterfaceExceptionDemo {

	public static void main(String[] args) {

        try {
            PaymentService.processPayment(10000);
        } catch (Exception e) {

            if (e instanceof Retryable) {
                System.out.println("Retry the operation: " + e.getMessage());
            } else {
                System.out.println("Do not retry: " + e.getMessage());
            }
        }
    }

}
