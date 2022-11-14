package com.ironhack.w1.w1d3;

public class HorrorMovie extends Movie {
    private boolean isReallyScary;

    public HorrorMovie(String title, int duration, boolean isReallyScary) {
        super(title, duration);
        this.isReallyScary = isReallyScary;
        setTitle(title);
    }

    public boolean isReallyScary() {
        return isReallyScary;
    }

    public void setReallyScary(boolean reallyScary) {
        isReallyScary = reallyScary;
    }

    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String toString() {
        return "HorrorMovie{" +
                super.getTitle() +
                super.getDuration() +
                "isReallyScary=" + isReallyScary +
                '}';
    }

    public void play() {
        System.out.println("AHHH!");
        System.out.println("Movie is playing");
    }
}
