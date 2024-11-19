package KISS;

class DiscountService {
    public double calculateDiscount(Customer customer) {
        if (customer.isPremium()) {
            return 10.0;
        }
        if (customer.getAge() < 18) {
            return 5.0;
        }
        return 0.0;
    }
}



/// Code before using KISS ----------->

/// class DiscountService {
// public double calculateDiscount(Customer customer) {
//     if (customer.isPremium() && customer.getAge() > 60) {
//         return 15.0; // Premium senior
//     }
//     if (customer.isPremium()) {
//         return 10.0; // Premium
//     }
//     if (!customer.isPremium() && customer.getAge() < 18) {
//         return 5.0; // Child
//     }
//     return 0.0; // Others
// }
// }