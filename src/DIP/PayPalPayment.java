package DIP;

class PayPalPayment implements PaymentMethod {
    public void processPayment() {
        System.out.println("Processing PayPal payment....");
    }
}