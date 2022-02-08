package wk05_Lab.Question2;

public class Triangle extends Shape{
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (0.5*super.dim1*super.dim2);
    }
    public static void main(String[] args) {
        Triangle r = new Triangle(10, 8);
        System.out.println("Area is: " + r.area());
    }
}
