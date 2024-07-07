package base;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("First task");
        int number = 7;
        while (number < 99) {
            System.out.print(number + " ");
            number += 7;
        }
        System.out.println("\n");
    }

    private static void task2() {
        System.out.println("Second task");
        final int amount = 10;
        final int max_range = 100;
        int max = 0;
        int sum = 0;
        int[] array = new int[amount];
        for (int i = 0; i < amount; ++i) {
            array[i] = (int) (Math.random() * max_range);
            sum += array[i];
            //System.out.print(array[i] + " ");

            if (array[i] > max) {
                max = array[i];
            }

        }

        System.out.println("Maximum: " + max);
        System.out.println("Average: " + sum / amount + "\n");

    }

    private static boolean check(int number, int del, int step) {
        if (number < 4) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        if (del * del <= number) {
            if (number % del == 0) {
                return false;
            } else {
                del += step;
                step ^= 6;
                return check(number, del, step);
            }
        }
        return true;
    }

    private static void task3() {
        System.out.println("Third task");
        System.out.print("Simple numbers: ");
        for (int number = 2; number <= 100; ++number) {
            if (check(number, 5, 2)) {
                System.out.print(number + " ");
            }
        }
        System.out.println("\n");
    }

    private static void task4() {
        System.out.println("Fourth task");
        for (int line = 1; line <= 3; ++line) {
            for (int column = 1; column <= 5; ++column) {
                if (column != 5) {
                    System.out.print("* ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }
}