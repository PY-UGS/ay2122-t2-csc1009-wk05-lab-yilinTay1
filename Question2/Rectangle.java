package wk05_Lab.Question2;

public class Rectangle extends Shape {

    //calling the parent class method / constructor.
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (super.dim1*super.dim2);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        System.out.println("Area is: " + r.area());
    }
}