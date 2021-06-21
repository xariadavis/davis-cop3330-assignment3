/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyTest {
    WordFrequency test = new WordFrequency();
    Word w1 = new Word("badger", 1);
    Word w2 = new Word("leo", 5);

    public void words(){
        test.readWord("badger");
        test.readWord("leo");
        test.readWord("leo");
        test.readWord("snake");
    }

    @Test
    @DisplayName("See if word 'snake' exists in array")
    void wordExists_snake() {
        this.words();
        assertTrue(test.wordExists("snake"));
    }

    @Test
    @DisplayName("Find 'badger' in our list and return it")
    void findWord() {
        this.words();
        String expected = w1.getWord();
        String actual = test.findWord("badger").getWord();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return the difference between the length of 'badger' and 'leo'")
    void compareWords() {
        int expected = 4;
        int actual = test.compareWords(w1, w2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Reads instance of leo and adds it (increments it in this case)")
    void readWord() {
        this.words();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.readWord("leo"); // testing function
        test.sortWords();
        test.printHistogram();

        String expected = """
                leo:    ***\r
                badger: *\r
                snake:  *\r
                """;

        assertEquals(expected, outContent.toString());
    }


    @Test
    @DisplayName("Prints sorted list")
    void sortWords() {
        this.words();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.sortWords();
        test.printHistogram();

        String expected = """
                leo:    **\r
                badger: *\r
                snake:  *\r
                """;

        assertEquals(expected, outContent.toString());
    }
}