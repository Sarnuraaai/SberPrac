package oop.circle;


public class Circle {
    private final double radius;
    private final String color;

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        System.out.print("Radius: " + this.radius + ", Color: " + this.color + ", Area: " + this.area() + ", Perimeter: " + this.perimeter() + "\n");
        return "";
    }
}
