package oop.matrix;

public class Matrix {
    private final double[][] table;
    private final int columns;
    private final int lines;

    public void setValue(int i, int j, int value) {
        this.table[i][j] = value;
    }

    public Matrix(int lines, int columns) {
        table = new double[lines][columns];
        this.lines = lines;
        this.columns = columns;
    }

    public Matrix sum(Matrix table) {
        if (this.table.length != table.table.length || this.table[0].length != table.table[0].length) {
            throw new NullPointerException("Размеры матриц разные!");
        }
        for (int i = 0; i < this.table[0].length; ++i) {
            for (int j = 0; j < this.table.length; ++j) {
                this.table[i][j] = this.table[i][j] + table.table[i][j];
            }
        }
        return this;
    }

    public Matrix mult(double number) {
        for (int i = 0; i < table[0].length; ++i) {
            for (int j = 0; j < table.length; ++j) {
                this.table[i][j] = this.table[i][j] * number;
            }
        }
        return this;
    }

    public Matrix mult(Matrix table) {
        Matrix new_table = new Matrix(this.table.length, table.table[0].length);
        for (int i = 0; i < new_table.table[0].length; ++i) {
            for (int j = 0; j < new_table.table.length; ++j) {
                for (int k = 0; k < new_table.table[0].length; ++k) {
                    new_table.table[i][j] = new_table.table[i][j] + this.table[i][k] * table.table[k][j];
                }
            }
        }
        return new_table;
    }

    public void print() {
        for (int i = 0; i < this.table.length; ++i){
            for(int j=0; j<this.table[0].length; ++j){
                System.out.print(this.table[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
