package LSP;

class Penguin extends Bird {
    public void move() {
        System.out.println("Penguin is walking.");
    }
}

// Code that violates the LSP Principle: The Penguin subclass breaks the behavior expected from the parent Bird class (ex Penguin cannot fly). This violates LSP because subclasses should be able to replace the parent class without causing issues.

// class Penguin extends Bird {
//     @Override
//     public void fly() {
//         throw new UnsupportedOperationException("Penguins can't fly!");
//     }
// }