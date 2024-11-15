package DIP;

class CreditCardPayment implements PaymentMethod {
    public void processPayment() {
        System.out.println("Processing credit card payment....");
    }
}
