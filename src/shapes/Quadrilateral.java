package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    //Default Constructor
    public Quadrilateral(){

    }

    //Constructor
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    //Getters
    public double getLength(){
        System.out.println("Your width is: " + this.length);
        return this.length;
    }
    public double getWidth(){
        System.out.println("Your with is: " + this.width);
        return this.width;
    }

    //Setters with abstract classes - No definition required w/in method
    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
