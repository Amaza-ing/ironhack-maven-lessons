package com.ironhack.w2d3;

public enum Category {
    BRONZE(1),
    SILVER(2),
    GOLD(3),
    PLATINUM(4),
    DIAMOND(5);

    public final int points;

    Category(int points) {
        this.points = points;
    }
}
