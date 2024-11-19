package CoI;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal(new Fly());
        bird.performMove();

        Animal fish = new Animal(new Swim());
        fish.performMove();

        Animal human = new Animal(new Walk());
        human.performMove();

        System.out.println("Bird falls into water....");
        bird.setMovementBehavior(new Swim());
        bird.performMove();
    }
}
