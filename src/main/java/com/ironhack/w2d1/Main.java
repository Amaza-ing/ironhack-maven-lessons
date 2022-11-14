package com.ironhack.w2d1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Arraylist usage
        ArrayList<String> carList = new ArrayList<String>();
        carList.add("Mercedes");
        carList.add("Nissan");
        System.out.println(carList);

//        No podemos hacer listas de variables primitivas (necesitamos su wrapper)
//        ArrayList<int> ints = new ArrayList<int>();

        List<String> daysList = new ArrayList<>();
        daysList.add("lunes");
        daysList.add("martes");
        System.out.println(daysList);

        LinkedList<String> subjectList = new LinkedList<>();
        subjectList.add("Math");


//        Using Gson
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Raven", 50));
        books.add(new Book("The Black Cat", 60));

        Author author = new Author("Edgar", "Allan Poe", books);
        Gson gson = new Gson();
        String authorJson = gson.toJson(author);
        System.out.println(authorJson);

        Author author1 = gson.fromJson(authorJson, Author.class);
        System.out.println(author1);


//        casting

        int intNumber = 10;
        double doubleNumber = (double) intNumber;
    }
}
