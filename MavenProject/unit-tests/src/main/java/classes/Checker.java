package classes;

public class Checker {
    public boolean zeroArgument(double number) {
        return number != 0;
    }

    public double sqrt(double number) {
        if (number < 0) {
            throw new ArithmeticException("Попытка извлечь корень из отрицательного числа");
        }
        return Math.sqrt(number);
    }
}
