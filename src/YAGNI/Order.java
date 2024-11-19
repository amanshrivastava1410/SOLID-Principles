package YAGNI;

class Order {
    private String product;

    public Order(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}


/// Code before using YAGNI-------------->

/// class Order {
// private String product;
// private String shippingAddress; // Unused
// private String deliveryTime;    // Unused

// public Order(String product) {
//     this.product = product;
// }

// public String getProduct() {
//     return product;
// }

// public void setShippingAddress(String address) {
//     this.shippingAddress = address;
// }

// public void setDeliveryTime(String time) {
//     this.deliveryTime = time;
// }
// }
