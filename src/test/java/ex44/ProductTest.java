/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product test = new Product("Keyboard", 55.65, 1);
    Product test2 = new Product("Monitor", 120.99, 2);

    @Test
    void getName_Keyboard() {
        String actual = test.getName();
        String expected = "Keyboard";
        assertEquals(expected, actual);
    }

    @Test
    void getName_Monitor() {
        String actual = test2.getName();
        String expected = "Monitor";
        assertEquals(expected, actual);
    }

    @Test
    void setName_Mouse() {
        test.setName("Mouse");
        String actual = this.test.getName();
        String expected = "Mouse";
        assertEquals(expected, actual);
    }

    @Test
    void setName_Speaker() {
        test.setName("Speaker");
        String actual = this.test.getName();
        String expected = "Speaker";
        assertEquals(expected, actual);
    }
}