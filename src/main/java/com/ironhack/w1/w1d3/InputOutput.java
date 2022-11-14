package com.ironhack.w1.w1d3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) throws IOException {
//        System.err.println("Prueba de error por consola");
//        System.out.println("Prueba de escritura normal por consola");

        Scanner scanner = new Scanner(System.in);
//
//        String name;
//        do {
//            System.out.println("Please write your name");
//            name = scanner.nextLine();
//        } while (name.length() < 3);
//        System.out.println("Your name is: " + name);
//




//        System.out.println("Please write your age");
//        int age = scanner.nextInt();
//        System.out.println("Your age is: " + age);
//
//
//        String ageStr;
//        boolean isValidName;
//
//        do {
//            System.out.println("Please, write your age");
//            ageStr = scannerSIn.nextLine();
//            isValidName = true;
//
//            for (int i = 0; i < ageStr.length(); i++) {
//                if (ageStr.charAt(i) < '0' || ageStr.charAt(i) > '9') {
//                    System.out.println("Age must be a number");
//                    isValidName = false;
//                    break;
//                }
//            }
//        } while (!isValidName);
//
//        int ageNum = Integer.parseInt(ageStr);
//        System.out.println("Age: " + ageNum);





        // TO DO --> Ejercicio Clase: Crear un check para que la edad introducida solo sean números

//        System.out.println("Class Exercise");
//        System.out.println("---------------");
//        Scanner scanner3 = new Scanner(System.in);
//        boolean isNumber;
//        String ageTest;
//
//        do {
//            // Reset isNumber in each iteration
//            isNumber = true;
//
//            System.out.println("Please introduce your age");
//            ageTest = scanner3.nextLine();
//
//            // Get chars from age input
//            char[] destinationArray = new char[ageTest.length()];
//            ageTest.getChars(0, ageTest.length(), destinationArray, 0);
//
//            // Checking if each char is a number
//            for (char c : destinationArray) {
//                //casting the char into integer (we get ascii code)
//                int asciiElement = c;
//                if (asciiElement < 47 || asciiElement > 58) {
//                    isNumber = false;
//                    break;
//                }
//            }
//        } while (isNumber == false);
//
//        System.out.println("Finally! So your age is: " + ageTest);
//        System.out.println("------------------------------------------------------");

//
//        scanner.close();

        File file = new File("src/com/ironhack/w1d3/fichero.txt");
        if (file.createNewFile()) {
            System.out.println("El archivo se ha creado");
        } else {
            System.out.println("El archivo ya existía");
        }

        String route = "src/com/ironhack/w1d3/fichero.txt";
        FileWriter fileWriter = new FileWriter(route, true);
        fileWriter.write("Esto es una linea\n");
        fileWriter.write("Esto es otra linea\n");
        fileWriter.close();

        Scanner scannerFile = new Scanner(file);
        String str = "";
        while (scannerFile.hasNextLine()) {
            str += scannerFile.nextLine();
            System.out.println(str);
        }
        scannerFile.close();
    }
}
