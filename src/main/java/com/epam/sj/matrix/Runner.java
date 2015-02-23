package com.epam.sj.matrix;

import com.epam.sj.matrix.model.Matrix;

public class Runner {

    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        Matrix matrixA = new Matrix(rows, columns);
        Matrix matrixB = new Matrix(rows, columns);
        matrixA.fillRandom();
        matrixB.fillRandom();

        Matrix matrixC = Matrix.multiply(matrixA, matrixB);

        System.out.println(matrixC);
    }

}
