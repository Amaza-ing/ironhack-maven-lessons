package com.ironhack.w1.w1d2;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        System.out.println(strings[0]);

        String[] subjectsArray = createSubjectsArray();
        System.out.println(subjectsArray[3]);

        for (int i = 0; i < subjectsArray.length; i++) {
            System.out.println(subjectsArray[i]);
        }

        int[] evenNumbers = new int[51];

        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[j] = i;
                j++;
            }
        }

        int[] newArray = new int[51];
        int k = 0;
        for (int number : evenNumbers) {
            System.out.println(number);
            newArray[k] = number;
            k++;
        }

        int counter = 0;
//        while (counter < evenNumbers.length) {
//            System.out.println(evenNumbers[counter]);
//            counter++;
//        }

        counter = 0;
        do {
            System.out.println(evenNumbers[counter]);
            counter++;
        } while (counter < evenNumbers.length);

        System.out.println(Math.sqrt(64));
        System.out.println(Math.pow(3, 6));
    }


    public static String[] createSubjectsArray() {
        String[] subjects = new String[5];
        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biología";
        subjects[4] = "Química";

        return subjects;
    }
}
