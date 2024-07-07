package paint;

public class PaintExample {
    public static void main(String[] args) {
        Point point = new Point(3, 3);
        Circle circle = new Circle(point, 7);
        Rect rect = new Rect(point, 3, 6);
        Square square = new Square(point, 2);
        Triangle triangle = new Triangle(point, 3, 4, 5);

        FigureUtil.draw(circle);
        FigureUtil.draw(square, Color.RED);
    }
}
