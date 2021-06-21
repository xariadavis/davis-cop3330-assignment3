/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */

package ex41;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution41 {
    public static void main(String[] args) throws IOException {
        // call method to read contents from input file
        // call method to sort contents returned from input file
        // call method to print sorted list to output file

        // declare any class variables to be used
            // Solution 41 myApp
            // Person p
            // GroupOfPeople myGroup
        Solution41 myApp = new Solution41();


        // initialize input and output file with entire file path as string
            // Format example == File file = new File("output.txt");
        File input = new File("Input Files/exercise41_input.txt");
        File output = new File("Output Files/exercise41_output.txt");

        // create unsorted list coming in from input
        ArrayList<Person> list = myApp.getInputScanner(input);

        GroupOfPeople myGroup = new GroupOfPeople(list); // initialized here instead because need list as a parameter

        // sort
        myGroup.alphabetSort();

        // call print method -- call output file as a parameter
        myGroup.printAllPeople(output);
    }

    // create method that returns unsorted list from input file
    // just scans, no test required
    public ArrayList<Person> getInputScanner(File input) throws IOException{
        Scanner myObj = new Scanner(input);

        // create list to hold names
        ArrayList<Person> myList = new ArrayList<Person>();

        // call a loop that creates a new Person after reading each line
            // while != null or something
                // read entire line
                // store names but spilt
                // assign 0 to lName and 1 to fName of a Person p
                // add p to the list
            // return the list

        while (myObj.hasNext()) {
            String fullName = myObj.nextLine();
            String[] names = fullName.split(", ", 2);
            Person p = new Person(names[1], names[0]);
            myList.add(p);
        }
        myObj.close();
        return myList;
    }
}
