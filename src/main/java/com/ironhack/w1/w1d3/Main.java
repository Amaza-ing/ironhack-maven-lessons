package com.ironhack.w1.w1d3;

public class Main {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", 100);
        Movie esdla = new Movie("El señor de los anillos", 200);
//        Movie otraPeli = harryPotter;
//        Movie nuevaPeli = movieCreator("Título", 300);

        System.out.println("Title: " + harryPotter.getTitle() + " Duration: " + harryPotter.getDuration());
        System.out.println("Title: " + esdla.getTitle() + " Duration: " + esdla.getDuration());
        System.out.println(harryPotter);
        harryPotter.play();

        HorrorMovie scream = new HorrorMovie("Scream", 90, false);
        System.out.println(scream);
        scream.play();

        Movie.getAlert();
    }

//    public static Movie movieCreator(String title, int duration) {
//        return new Movie(title, duration);
//    }
}
