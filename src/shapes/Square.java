package shapes;

public class Square extends Rectangle{
    protected double side;

    public Square(double side){
        super(side, side);
        this.side = side;
    }

    public double getPerimeter(){
        System.out.println("get perimeter from square class");
        return 4 * side;
    }

    public double getArea(){
        System.out.println("get area from square class");
        return Math.pow(side, 2);
    }

}