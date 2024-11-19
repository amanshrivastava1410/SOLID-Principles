package APO;

class DataProcessor {
    public void process(String data) {
        System.out.println("Processed: " + data.toUpperCase());
    }
}


/// Code before using APO ---------->

/// class DataProcessor {
//     public void process(String data) {
//         // Simulating a complex and unnecessary optimization.
//         StringBuilder reversedData = new StringBuilder(data).reverse();
//         System.out.println("Processed: " + reversedData.toString().toUpperCase());
//     }
// }