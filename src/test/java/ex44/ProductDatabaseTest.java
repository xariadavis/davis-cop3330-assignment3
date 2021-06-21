/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class ProductDatabaseTest {
    File input = new File("Input Files/exercise44_input.json");
    ProductDatabase test = new ProductDatabase(input);

    @Test
    @DisplayName("Search for Thing")
    void searchForProduct_Thing() {
        boolean actual = test.searchForProduct("Thing");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Search for Widget")
    void searchForProduct_Widget() {
        boolean actual = test.searchForProduct("Widget");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Search for Doodad")
    void searchForProduct_Doodad() {
        boolean actual = test.searchForProduct("Doodad");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Search for Galaxy")
    void searchForProduct_Galaxy() {
        boolean actual = test.searchForProduct("Galaxy");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Search for iPad")
    void searchForProduct_iPad() {
        boolean actual = test.searchForProduct("iPad");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Does list contain Thing?")
    void contains_Thing() {
        boolean actual = test.contains("Thing");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Does list contain Widget?")
    void contains_Widget() {
        boolean actual = test.contains("Widget");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Does list contain Doodad?")
    void contains_Doodad() {
        boolean actual = test.contains("Doodad");
        assertTrue(actual);
    }

    @Test
    @DisplayName("Does list contain Galaxy?")
    void contains_Galaxy() {
        boolean actual = test.contains("Galaxy");
        assertFalse(actual);
    }

    @Test
    @DisplayName("Does list contain iPad?")
    void contains_iPad() {
        boolean actual = test.contains("iPad");
        assertFalse(actual);
    }
}