package com.ironhack.w2d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    @Test
    void multiply_largeInts_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathLibrary.multiply(900000000, 400000000);
        });
    }
}