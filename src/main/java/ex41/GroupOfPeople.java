/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex41;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class GroupOfPeople {
    public ArrayList<Person> groupList;
    public int numPeople;

    // constructor for GroupOfPeople
        // public GroupOfPeople(array of people: myList){
            // this.groupList = myList
            // this numPeople = myList.size
    public GroupOfPeople(ArrayList<Person> myList) {
        this.groupList = myList;
        this.numPeople = myList.size();
    }

    // print to output file
    public void printAllPeople(File output) throws IOException {

        // define PrintStream
        // print the header
        // for the total number of people
            // print lastName, firstName for i person

        PrintStream outputFile = new PrintStream(output);
        outputFile.println("Total of " + this.numPeople + " names");
        outputFile.println("-----------------");
        for (int i = 0; i < this.numPeople; i++) {
            Person currPerson = this.groupList.get(i);
            String currentLine = currPerson.getLastName() + ", " + currPerson.getFirstName();
            outputFile.println(currentLine);
        }
    }

    // compare people
        // return the diff in string of last name -- use to alphabet sort
        // String f1, f2, l1, l2
        // int lCompare = l1.compareTo(l2)
                // if != 0 return lCompare

    public int comparePeople(Person p1, Person p2) {
        String l1 = p1.getLastName();
        String l2 = p2.getLastName();
        int lCompare = l1.compareTo(l2);
        if (lCompare != 0) return lCompare;

        String f1 = p1.getFirstName();
        String f2 = p2.getFirstName();
        return f1.compareTo(f2);
    }

    // sort the list alphabetically
        // lambda?
    public void alphabetSort(){
        this.groupList.sort(this::comparePeople);
    }
}
