package LoD;

class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void printCustomerCity() {
        System.out.println("Customer's city: " + customer.getCity());
    }
}


/// Code before using LoD -------------->
 
/// class Order {
// private Customer customer;

// public Order(Customer customer) {
//     this.customer = customer;
// }

// public void printCustomerCity() {
//     System.out.println("Customer's city: " + customer.getAddress().getCity());
// }
// }