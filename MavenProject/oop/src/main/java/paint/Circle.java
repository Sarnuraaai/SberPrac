package paint;

public class Circle extends Figure implements Drawable {
    private double radius;

    public Circle(Point point, double radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String draw() {
        return "чёрный круг с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }

    @Override
    public String draw(Color color) {
        return color.getColor() + " круг с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }
}
