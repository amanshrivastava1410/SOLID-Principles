package OCP;

public class OCPMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        AreaCal calculator = new AreaCal();
        System.out.println("Circle area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle));
    }
}
