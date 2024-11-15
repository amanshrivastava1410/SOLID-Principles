package DIP;

class PaymentService {
    private PaymentMethod paymentMethod;

    public PaymentService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void makePayment() {
        paymentMethod.processPayment();
    }
}


//  Code that violates the DIP Principle: The high-level PaymentService depends directly on the low-level CreditCardPayment class. This violates DIP because high-level modules should not depend on low-level modules.

// class PaymentService {
//     private CreditCardPayment payment;

//     public PaymentService() {
//         this.payment = new CreditCardPayment();
//     }

//     public void makePayment() {
//         payment.processPayment();
//     }
// }
