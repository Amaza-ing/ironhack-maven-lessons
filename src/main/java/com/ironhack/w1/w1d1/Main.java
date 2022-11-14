package com.ironhack.w1.w1d1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int number = 100;
        int number2;

        number2 = 50;
//        System.out.println(number);
//        System.out.println(number2);

        double decimalNumber = 14.15;

        Integer number3 = 100;
        Byte number4 = 1;
        Double number5 = 1.234;

//        System.out.println(number3);

//        String holaMundo = "Hola mundo";

//        System.out.println(number + number2);
//        System.out.println(number - number2);
//        System.out.println(number * number2);
//        System.out.println(number / number2);
//        System.out.println(5 / 2);
//        System.out.println(5 % 2);

        System.out.println(number);

//        number = number + 1;
//        System.out.println(number);

//        number += 2;
//        number -= 2;
//        number *= 2;
//        number /= 2;

//        number++;
//        ++number;
//        System.out.println(--number);
//        System.out.println(number);

        number = -100;
        if (number >= 1000) {
            System.out.println("Number es mayor o igual que 1000");
        } else if (number > 0 && number < 1000) {
            System.out.println("Number es mayor que 0 y menor que 1000");
        } else if (number == 0) {
            System.out.println("Number es igual a 0");
        } else {
            System.out.println("Number es un número negativo");
        }

        System.out.println("Number tiene un valor de: " + number);

        boolean isNumberEven;

//        if (number % 2 == 0) {
//            isNumberEven = true;
//        } else {
//            isNumberEven = false;
//        }

        isNumberEven = number % 2 == 0 ? true : false;


        String hola = "Hola que pasa";
        String string2 = "Ironhack!";
        System.out.println(hola + string2);

        String upperCase = hola.toUpperCase();
        System.out.println(upperCase);

        int stringLength = hola.length();
        System.out.println("hola length: " + stringLength);

        String[] stringArray = hola.split(" ");
        System.out.println(Arrays.toString(stringArray));
        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}