package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args){
        System.out.println("Enter a radius for the circle: ");
        double userRadius = Input.getDouble();
        Circle circle = new Circle(userRadius);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.printf("The area of the circle is %s and the circumference is %s.", area, circumference);
    }
}