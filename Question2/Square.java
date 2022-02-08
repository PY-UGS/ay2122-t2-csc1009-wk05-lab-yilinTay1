package wk05_Lab.Question2;

public class Square extends Shape {
    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (super.dim1*super.dim2);
    }
    public static void main(String[] args) {
        Square r = new Square(6, 6);
        System.out.println("Area is: " + r.area());
    }
}
