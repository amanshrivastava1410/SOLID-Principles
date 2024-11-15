package DIP;

public class DIPMain {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();
        
        PaymentService creditCardService = new PaymentService(creditCardPayment);
        PaymentService payPalService = new PaymentService(payPalPayment);
        
        creditCardService.makePayment();
        payPalService.makePayment(); 
    }
}
