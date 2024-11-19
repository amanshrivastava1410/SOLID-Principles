package TDA;

class Order {
    private double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    public void applyDiscount() {
        if (amount > 100) {
            System.out.println("Discount applied for amount: " + amount);
        } else {
            System.out.println("No discount applied.");
        }
    }
}