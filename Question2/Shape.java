package wk05_Lab.Question2;

public abstract class Shape {
    public double dim1;
    public double dim2;
    public static final double PI = 3.14159265358979323846;

    public Shape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    public abstract double area();//abstract method area() 
}
