package com.ironhack.w2d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
//    Exceptions, you must catch them in a try catch block

    public static void main(String[] args) {
        readFile("myFile.txt");
        printLength("Hola Mundo!");
        printLength(null);

        try {
            printArray(null);
        } catch (NullPointerException e) {
            System.out.println("Array cannot be null");
        }

        int a = 900000000;
        int b = 400000000;
        try {
            int product = multiply(a, b);
            System.out.println("Product: " + product);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Using long version");
            long product = multiply((long) a, (long) b);
            System.out.println(product);
        } finally {
            System.out.println("dentro del finally");
        }

        int result = 0;
        try {
            result = divide(12312, 0);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("result: " + result);

        System.out.println("El programa ha llegado hasta aquí");


//        Equals, hash & toString
        Book book1 = new Book(13245, "Harry Potter", "J.K. Rowling", 1995);
        Book book2 = new Book(54546, "Harry Potter", "J.K. Rowling", 1995);

        System.out.println("Book1: " + book1);
        System.out.println("Book2: " + book2);

        System.out.println("Book1 == Book2: " + book1.equals(book2));

    }

//    Checked exception
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
//            e.printStackTrace();
        }
    }

//    Unchecked exception
    public static void printLength(String myString) {
//        if (myString == null) return;
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("String cannot be null");
        }
    }

//    Throws exception
    public static void printArray(int[] numArray) throws NullPointerException {
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }

//    Throwing exceptions
    public static int multiply(int a, int b) {
        int product = a * b;
        if (product / a != b) {
            throw new IllegalArgumentException("El producto de los argumentos es demasiado grande");
        }
        return product;
    }

    public static long multiply(long a, long b) {
        return a * b;
    }

    public static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException("you cannot divide by zero");
        }
        return a / b;
    }
}
