package Q5;

import java.lang.Math;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(other.getX() - x, 2) + Math.pow(other.getY() - y, 2));
    }
}

abstract class Shape {
    abstract double area();
    abstract double perimeter();
    abstract String colour();
    
    String compareShape(Shape obj) {
        if (this.area() == obj.area() && this.perimeter() == obj.perimeter()) {
            return "Matching Shapes";
        } else {
            return "Non-matching Shapes";
        }
    }
}

class Triangle extends Shape {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    // Constructor, getters, and setters for Triangle
    
    @Override
    double area() {
        // Implement area calculation for triangle
        // Return the calculated area
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    double perimeter() {
        // Implement perimeter calculation for triangle
        // Return the calculated perimeter
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    String colour() {
        return "Triangle colour"; // Return the colour of the triangle
    }
}

class Rectangle extends Shape {
    private Point topLeft;
    private Point bottomRight;

    // Constructor, getters, and setters for Rectangle
    
    @Override
    double area() {
        // Implement area calculation for rectangle
        // Return the calculated area
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    double perimeter() {
        // Implement perimeter calculation for rectangle
        // Return the calculated perimeter
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    String colour() {
        return "Rectangle colour"; // Return the colour of the rectangle
    }
}

class Circle extends Shape {
    private Point center;
    private double radius;

    // Constructor, getters, and setters for Circle
    
    @Override
    double area() {
        // Implement area calculation for circle
        // Return the calculated area
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    double perimeter() {
        // Implement perimeter calculation for circle
        // Return the calculated perimeter
        return 0.0; // Placeholder, implement the actual calculation
    }

    @Override
    String colour() {
        return "Circle colour"; // Return the colour of the circle
    }
}

public class TestShapes {
    public static void main(String[] args) {
        // Test your code using dynamic method dispatch here
        Shape shape1 = new Rectangle();
        Shape shape2 = new Rectangle();
        
        // Perform operations or comparisons using the shapes
        String result = shape1.compareShape(shape2);
        System.out.println(result);
    }
}
