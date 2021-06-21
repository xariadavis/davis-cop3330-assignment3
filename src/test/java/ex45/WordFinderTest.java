/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    WordFinder test = new WordFinder();

    @Test
    @DisplayName("Return str that replaces utilize with use")
    void replaceUtilize() {
        String actual = test.replaceUtilize("Cynthia continued to utilize her camera, apologizing for her time-consuming perfectionism.");
        String expected = "Cynthia continued to use her camera, apologizing for her time-consuming perfectionism.";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return str that replaces utilize with use")
    void replaceUtilize_assertFalse() {
        String actual = test.replaceUtilize("Cynthia continued to utilize her camera, apologizing for her time-consuming perfectionism.");
        String expected = "Cynthia continued to utilize her camera, apologizing for her time-consuming perfectionism.";
        assertNotEquals(expected, actual);
    }
}