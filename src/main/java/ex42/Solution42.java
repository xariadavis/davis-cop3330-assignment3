/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex42;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution42 {
    public static void main(String[] args) throws IOException {
        // read data from input (no sorting necessary)
        // print input in the form of a table resembling the example output

        // create file input and output variables
        File input = new File("Input Files/exercise42_input.txt");

        // declare instance variables for classes
        // declare a list to pass into Group class
        // call print function

        Solution42 myApp = new Solution42();
        ArrayList<Person42> list = myApp.getScannerInput(input);

        GroupOfPeople42 myGroup = new GroupOfPeople42(list);
        myGroup.printAllPeople();
    }

    // get scanner input, no test required
    public ArrayList<Person42> getScannerInput(File input) throws IOException {
        Scanner myObj = new Scanner(input);

        // create an Array list to hold all the info while we iterate through the list
        ArrayList<Person42> myList = new ArrayList<>();

        // go through list and add info
        // while myObj hasNext
            // read netLine
            // store split string into three
                // first
                // last
                // salary
            // create new Person42 p
            // add p to list
        // return list

        while(myObj.hasNext()) {
            String fullLine = myObj.nextLine();
            String[] nameAnSalary = fullLine.split(",", 3);
            Person42 p = new Person42(nameAnSalary[1], nameAnSalary[0], nameAnSalary[2]);
            myList.add(p);
        }

        return myList;
    }
}
