package wk05_Lab.Question2;

public class main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7, 7);
        Square s = new Square(6, 6);

        Shape figref; // This is OK, no object is created 

        figref = r;
        System.out.println("Inside Area for Rectangle.");
        System.out.println("Area is: " + figref.area());
        figref = t;
        System.out.println("Inside Area for Triangle.");
        System.out.println("Area is: " + figref.area());
        figref = c;
        System.out.println("Inside Area for Circle.");
        System.out.printf("Area is: %.2f\n",figref.area());
        figref = e;
        System.out.println("Inside Area for Ellipse.");
        System.out.printf("Area is: %.2f\n",figref.area());
        figref = s;
        System.out.println("Inside Area for Square.");
        System.out.println("Area is: " + figref.area());
    }
}
