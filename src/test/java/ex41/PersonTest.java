/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person testMyName = new Person("Xaria", "Davis");
    Person janeDoe = new Person("Jane", "Doe");

    @Test
    @DisplayName("Return my first name: Xaria")
    void getFirstName_Xaria() {
        String testFirstName = testMyName.getFirstName();
        assertEquals("Xaria", testFirstName);
    }

    @Test
    @DisplayName("Return my last name: Davis")
    void getLastName_Davis() {
        String testLastName = testMyName.getLastName();
        assertEquals("Davis", testLastName);
    }

    @Test
    @DisplayName("Return first name: Jane")
    void getFirstName_Jane() {
        String testFirstName = janeDoe.getFirstName();
        assertEquals("Jane", testFirstName);
    }

    @Test
    @DisplayName("Return last name: Doe")
    void getLastName_Doe() {
        String testLastName = janeDoe.getLastName();
        assertEquals("Doe", testLastName);
    }
}