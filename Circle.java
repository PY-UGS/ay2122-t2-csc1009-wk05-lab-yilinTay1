package wk05_Lab;
import java.lang.Math;

public class Circle extends GeometricObject{
    //extends to establish an inheritance relationship
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        //super reference  used to invoke the parent's class method/constructor
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return (Math.PI*Math.pow(this.radius,2));
    }

    public double getPerimeter(){
        return (2*Math.PI*this.radius);
    }

    public double getDiameter(){
        return (this.radius*2);
    }
}