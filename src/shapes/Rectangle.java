package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //default constructor
    public Rectangle(){

    }
    //default constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;

    }
    //GET AREA -Overloaded -Polymorphism Here
    public double getArea(double length, double width){
        return length * width;
    }

 
    public static int getArea(int length, int width){
        return length * width;
    }
    //GET PERIMETER -Overloaded-Polymorphism Here
    public double getPerimeter(double length, double width){
        return (2 * length) + (2 * width);
    }
    public static int getPerimeter(int length, int width){
        return (2 * length) + (2 * width);
    }


    public void getArea() {
    }
}
