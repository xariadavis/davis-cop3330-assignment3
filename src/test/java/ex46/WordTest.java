/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {
    Word test = new Word("Duck", 1);
    Word test2 = new Word("Goose", 3);

    @Test
    @DisplayName("Get word for test: Duck")
    void getWord_Duck() {
        String actual = test.getWord();
        String expected = "Duck";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get word for test: Goose")
    void getWord_Goose() {
        String actual = test2.getWord();
        String expected = "Goose";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get frequency for test: 1")
    void getFrequency_1() {
        int actual = test.getFrequency();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get frequency for test: 3")
    void getFrequency_3() {
        int actual = test2.getFrequency();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get incremented frequency for test: 2")
    void incrementFrequency_2() {
        test.incrementFrequency();
        int actual = this.test.getFrequency();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Get incremented frequency for test: 4")
    void incrementFrequency_4() {
        test2.incrementFrequency();
        int actual = this.test2.getFrequency();
        int expected = 4;
        assertEquals(expected, actual);
    }
}