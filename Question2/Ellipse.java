package wk05_Lab.Question2;

public class Ellipse extends Shape{

    public Ellipse(double dim1, double dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return (super.PI*super.dim1*super.dim2);
    }
    public static void main(String[] args) {
        Ellipse r = new Ellipse(7, 7);
        System.out.println("Area is: " + r.area());
    }
}
