package ISP;

public class ISPMain {
    public static void main(String[] args) {
        Workable robot = new Robot();
        Workable human = new Human();
        Eatable humanEatable = (Eatable) human;

        robot.work();
        human.work();
        humanEatable.eat();
    }
}
