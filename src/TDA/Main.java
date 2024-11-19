package TDA;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(150);
        Invoice invoice = new Invoice();
        invoice.generate(order);
    }
}