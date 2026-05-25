// In Java, we can create a method that doesn't have a body. These methods are called abstract methods.
// They must be declared inside an abstract class only.

abstract class Polygon {

    // abstract method
    abstract void getArea();  // if any subclass of Polygon is made without getArea() method, Java will immediately throw a compile error

    // regular method
    void printSides(int side) {
        System.out.println("This polygon has " + side + " sides");
    }
}

// In order to use an abstract class, we must derive subclass from it.

class Rectangle extends Polygon {
    private double length, breadth;
    
    Rectangle(double l, double b) {
        this.length = l;
        this.breadth = b;
    }
    // implement abstract method
    @Override
    void getArea() {
        System.out.println("Area of Rectangle: " + (this.length * this.breadth));
    }
    void printSides() {
        super.printSides(4);
    }
}

class Circle extends Polygon {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    @Override
    void getArea() {
        System.out.printf("Area of Circle: %.2f%n", (this.radius * this.radius * Math.PI));
    }
    void printSides() {
        System.out.println("Circle has no sides.");
    }
}

public class Abstract {
    
    public static void main(String[] args) {
        // Polygon obj = new Polygon(); -> Will give an error, because we cannot create objects of an abstract class.

        Rectangle obj = new Rectangle(2, 4);
        obj.printSides();
        obj.getArea();

        Circle obj2 = new Circle(5);
        obj2.printSides();
        obj2.getArea();
    }
}

// Abstract classes are created to add features to other classes.
// For example, the Polygon class is not used directly. However, it's members are used by the Rectangle subclass