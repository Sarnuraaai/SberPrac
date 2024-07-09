package classes;

public class Calc {

    private Checker checker;

    public Calc(Checker check) {
        checker = check;
    }

    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if (checker.zeroArgument(secondNumber)) {
            return firstNumber / secondNumber;
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