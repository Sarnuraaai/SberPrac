package classes;

public class Calc {

    private Checker checker;

    public Calc(Checker check) {
        checker = check;
    }

    public double add(double first_number, double second_number) {
        return first_number + second_number;
    }

    public double divide(double first_number, double second_number) {
        if (checker.zeroArgument(second_number)) {
            return first_number / second_number;
        }
        throw new ArithmeticException("Попытка деления на нуль!");
    }

    public double sqrt(double number) {
        return checker.sqrt(number);
    }

    private double lg(double number) {
        if (number < 0) {
            throw new ArithmeticException("Число не может быть меньше нуля!");
        }
        return Math.log10(number);
    }
}