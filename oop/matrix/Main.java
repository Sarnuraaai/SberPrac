package oop.matrix;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);

        matrix1.setValue(1,1,5);
        matrix1.setValue(0,0,5);
        matrix1.setValue(2,2,5);
        matrix2.setValue(0,0,1);
        matrix2.setValue(1,1,2);
        matrix2.setValue(2,2,3);

        matrix1.print();
        matrix2.print();

        matrix1 = matrix1.mult(5);
        matrix1.print();

        matrix1 = matrix1.sum(matrix2);
        matrix1.print();

        matrix1 = matrix1.mult(matrix2);
        matrix1.print();

    }
}