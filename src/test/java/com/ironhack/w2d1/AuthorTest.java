package com.ironhack.w2d1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    public static List<Book> books = new ArrayList<>();
    public static Author author;

    @BeforeAll
    public static void beforeAll() {
        books.add(new Book("The Raven", 50));
        books.add(new Book("The Black Cat", 60));
    }

    @BeforeEach
    public void setUp() {
//        System.out.println("antes de cada test");
        author = new Author("Edgar", "Allan Poe", books);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("después de cada test");
    }

    @Test
    void getBookListSize_validBookList_correctSize() {
        int bookListSize = author.getBookListSize();
        System.out.println("book list size: " + bookListSize);

        assertEquals(2, bookListSize);
    }

    @Test
    void getFullName() {
        String fullName = author.getFullName();
        System.out.println("full name: " + fullName);

        assertEquals("Edgar Allan Poe", fullName);
    }

    @Test
    void bookListToArray() {
        Book[] bookArray = {
                new Book("The Raven", 50),
                new Book("The Black Cat", 60)
        };
        Book[] authorBookArray = author.bookListToArray();

        for (int i = 0; i < bookArray.length; i++) {
            assertEquals(bookArray[i].getTitle(), authorBookArray[i].getTitle());
            assertEquals(bookArray[i].getPages(), authorBookArray[i].getPages());
        }
    }
}