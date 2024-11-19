package TDA;

class Invoice {
    public void generate(Order order) {
        order.applyDiscount();
    }
}


/// Code before using TDA ------------>
/// 
// class Invoice {
//     public void generate(Order order) {
//         double amount = order.getAmount();
//         if (amount > 100) {
//             System.out.println("Discount applied for amount: " + amount);
//         } else {
//             System.out.println("No discount applied.");
//         }
//     }
// }