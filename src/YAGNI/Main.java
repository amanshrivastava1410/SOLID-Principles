package YAGNI;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Laptop");
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder(order);
    }
}