package oop.paint;

public class Triangle extends Figure implements Drawable {
    private double a;
    private double b;
    private double c;

    public Triangle(Point point, double a, double b, double c) {
        super(point);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String draw() {
        return "чёрный треугольник с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }

    @Override
    public String draw(Color color) {
        return color.getColor() + " треугольник с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }
}
