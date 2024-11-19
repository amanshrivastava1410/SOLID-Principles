package KISS;

class Customer {
    private boolean isPremium;
    private int age;

    public Customer(boolean isPremium, int age) {
        this.isPremium = isPremium;
        this.age = age;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public int getAge() {
        return age;
    }
}
