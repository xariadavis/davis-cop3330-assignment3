/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Person42Test {
    Person42 p1 = new Person42("Mai", "Ling", "55900");
    Person42 p2 = new Person42("Aaron", "Jones", "46000");

    @Test
    void getFirstName_Mai() {
        String testFirstName = p1.getFirstName();
        assertEquals("Mai", testFirstName);
    }

    @Test
    void getLastName_Ling() {
        String testLastName = p1.getLastName();
        assertEquals("Ling", testLastName);
    }

    @Test
    void getSalary_55900() {
        String testSalary = p1.getSalary();
        assertEquals("55900", testSalary);
    }

    @Test
    void getFirstName_Aaron() {
        String testFirstName = p2.getFirstName();
        assertEquals("Aaron", testFirstName);
    }

    @Test
    void getLastName_Jones() {
        String testLastName = p2.getLastName();
        assertEquals("Jones", testLastName);
    }

    @Test
    void getSalary_46000() {
        String testSalary = p2.getSalary();
        assertEquals("46000", testSalary);
    }
}