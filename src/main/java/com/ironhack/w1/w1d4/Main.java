package com.ironhack.w1.w1d4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
//        Player player = new WebPlayer(0.5, 1);
//        WebPlayer webPlayer = new WebPlayer(0.9, 2);
//        System.out.println(player.getCurrentTrack());
//        System.out.println(webPlayer.getCurrentTrack());

        System.out.println(1.2 - 1.0);
        BigDecimal bd1 = new BigDecimal("1.298798789");
        BigDecimal bd2 = new BigDecimal("1.03423234");

        System.out.println(bd1.add(bd2));
        System.out.println(bd1.subtract(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(bd2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.setScale(2, RoundingMode.HALF_EVEN));
        System.out.println(bd1.compareTo(bd2));
    }
}
