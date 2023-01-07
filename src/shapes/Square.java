package shapes;

public class Square extends Quadrilateral{
    public Square(int i, int i1) {
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }




    /*NOTE: In Exercise for Interfaces and Abstract Classes*/

//    protected double side;
//
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getPerimeter(){
//        System.out.println("get perimeter from square class");
//        return 4 * side;
//    }
//
//    public double getArea(){
//        System.out.println("get area from square class");
//        return Math.pow(side, 2);
//    }

}