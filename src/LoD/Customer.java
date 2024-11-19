package LoD;

class Customer {
    private Address address;

    public Customer(Address address) {
        this.address = address;
    }

    public String getCity() {
        return address.getCity();
    }
}