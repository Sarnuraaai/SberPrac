package oop.paint;

public class FigureUtil {

    private FigureUtil() {

    }

    public static double area(Figure figure) {
        return figure.area();
    }

    public static double perimeter(Figure figure) {
        return figure.perimeter();
    }

    public static void draw(Drawable figure) {
        System.out.println("Нарисована фигура " + figure.draw());
    }

    public static void draw(Drawable figure, Color color) {
        System.out.println("Нарисована фигура " + figure.draw(color));
    }
}
