package com.epam.sj.matrix.model;

import java.util.Arrays;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] values;

    public static Matrix multiply(Matrix matrixA, Matrix matrixB) {
        Matrix result = new Matrix(matrixA.getRows(), matrixB.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValue(i, j, matrixA.getValue(i, j) * matrixB.getValue(i, j));
            }

        }
        return result;

    }


    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.values = new int[rows][columns];
    }

    private int getValue(int row, int column) {
        return values[row][column];
    }

    private void setValue(int row, int column, int value) {
        values[row][column] = value;
    }

    @Override
    public String toString() {
        return "Matrix {" +
                "rows = " + rows +
                ", columns=" + columns +
                ", values=" + Arrays.deepToString(values)  +
                "}";
    }


    public void fillRandom() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                setValue(i, j, (int) (Math.random()*10));
            }

        }
    }
}
