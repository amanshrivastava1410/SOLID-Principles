package LoD;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Barcelona");
        Customer customer = new Customer(address);
        Order order = new Order(customer);
        order.printCustomerCity();
    }
}