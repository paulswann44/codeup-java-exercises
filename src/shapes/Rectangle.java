
package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("get area from rectangle class");
        return length * width;
    }

    public double getPerimeter(){
        System.out.println("get perimeter from rectangle class");
        return (2*length) + (2*width);
    }
}
