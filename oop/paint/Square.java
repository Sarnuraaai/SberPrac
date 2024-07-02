package oop.paint;

public class Square extends Rect implements Drawable {
    private double side;

    public Square(Point point, double side) {
        super(point, side, side);
    }

    @Override
    public String draw() {
        return "чёрный квадрат с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }

    @Override
    public String draw(Color color) {
        return color.getColor() + " квадрат с координатами (x: " + this.getPoint().x + ", y: " + this.getPoint().y + ")";
    }
}
