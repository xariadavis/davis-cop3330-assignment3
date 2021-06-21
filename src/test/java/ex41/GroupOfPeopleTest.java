/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex41;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfPeopleTest {
    Solution41 getList = new Solution41();
    File input = new File("Input Files/exercise41_input.txt");
    public ArrayList<Person> myList = getList.getInputScanner(input);
    GroupOfPeople test = new GroupOfPeople(myList);

    Person p1 = new Person("Mai", "Ling");
    Person p2 = new Person("Aaron", "Jones");
    Person p3 = new Person("Fong", "Xiong");

    GroupOfPeopleTest() throws IOException {
    }

    @Test
    @DisplayName("Return difference in name of Mai and Aaron")
    void comparePeople_MaiToAaron() {
        int actual = 2;
        int expected = test.comparePeople(p1, p2);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return difference in name of Mai and Xiong")
    void comparePeople_MaiToXiong() {
        int actual = -12;
        int expected = test.comparePeople(p1, p3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return difference in name of Aaron and Xiong")
    void comparePeople_AaronToXiong() {
        int actual = -14;
        int expected = test.comparePeople(p2, p3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return list sorted by last name")
    void alphabetSort() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.alphabetSort();

        for (Person currPerson : this.myList) {
            String currentLine = currPerson.getLastName() + ", " + currPerson.getFirstName();
            System.out.println(currentLine);
        }

        String expected = """
                Johnson, Jim\r
                Jones, Aaron\r
                Jones, Chris\r
                Ling, Mai\r
                Swift, Geoffrey\r
                Xiong, Fong\r
                Zarnecki, Sabrina\r
                """;

        assertEquals(expected, outContent.toString());
    }
}