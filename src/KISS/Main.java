package KISS;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(true, 25);
        DiscountService discountService = new DiscountService();
        System.out.println("Discount: " + discountService.calculateDiscount(customer));
    }
}