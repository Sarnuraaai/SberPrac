package oop.pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Аль-Капчоне", Pizza.Size.LARGE, true, "Ярославская 101");
        pizza.cancel();
        pizza.order();
        pizza.order();
        pizza.cancel();
        pizza.toString();
    }
}