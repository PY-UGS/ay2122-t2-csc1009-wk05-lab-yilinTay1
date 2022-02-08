package wk05_Lab.Question2;

public class Circle extends Shape{
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (super.PI*super.dim1*super.dim2);
    }
    public static void main(String[] args) {
        Circle r = new Circle(5, 5);
        System.out.println("Area is: " + r.area());
    }
    
}
