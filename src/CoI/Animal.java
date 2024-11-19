package CoI;

class Animal {
    private Movement movementBehavior;

    public Animal(Movement movementBehavior) {
        this.movementBehavior = movementBehavior;
    }

    public void performMove() {
        movementBehavior.move();
    }

    public void setMovementBehavior(Movement newBehavior) {
        this.movementBehavior = newBehavior;
    }
}


//// Code before CoI ----------->

/// class Animal {
// public void move() {
//     System.out.println("Generic movement.");
// }
// }

// class Bird extends Animal {
// @Override
// public void move() {
//     System.out.println("Flying in the sky.");
// }
// }

// class Fish extends Animal {
// @Override
// public void move() {
//     System.out.println("Swimming in the water.");
// }
// }

// class Human extends Animal {
// @Override
// public void move() {
//     System.out.println("Walking on land.");
// }
// }