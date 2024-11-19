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
