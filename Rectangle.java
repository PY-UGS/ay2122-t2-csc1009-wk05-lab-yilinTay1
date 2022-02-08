package wk05_Lab;

public class Rectangle extends GeometricObject {
    // extends to establish an inheritance relationship
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        // super reference used to invoke the parent's class method/constructor
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return (this.width * this.height);
    }

    public double getPerimeter() {
        return (2 * (this.width + this.height));
    }

}