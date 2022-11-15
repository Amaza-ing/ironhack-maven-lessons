package com.ironhack.w2d2;

public class MathLibrary {

    public static int multiply(int a, int b) {
        int product = a * b;
        if (product / a != b) {
            throw new IllegalArgumentException("El producto de los argumentos es demasiado grande");
        }
        return product;
    }
}
