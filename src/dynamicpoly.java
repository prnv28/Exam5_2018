class Shape
{
    double height;
    double width;
    Shape(double a, double b) {
        height = a;
        width = b;
    }
    double area() {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}
class Rectangle extends Shape {
    Rectangle(double a, double b) {
        super(a, b);
    }
    // override area for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return height * width;
    }
}
class Triangle extends Shape {
    Triangle(double a, double b) {
        super(a, b);
    }
    // override area for right triangle
    double area() {
        System.out.println("Inside Area for Triangle.");
        return height * width / 2;
    }
}
public class dynamicpoly{
    public static void main(String args[]) {
        Shape f = new Shape(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Shape figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = f;
        System.out.println("Area is " + figref.area());
    }
}