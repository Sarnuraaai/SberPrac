package paint;

public class Rect extends Figure implements Drawable {
    private double height;
    private double width;

    public Rect(Point point, double height, double width) {
        super(point);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

    @Override
    public String draw() {
        return "чёрный прямоугольник с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }

    @Override
    public String draw(Color color) {
        return color.getColor() + " прямоугольник с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }
}
