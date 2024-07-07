package circle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12.7, "green");
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        circle.toString();
        Circle circle2 = new Circle(10, "RED");
        circle2.toString();
    }
}