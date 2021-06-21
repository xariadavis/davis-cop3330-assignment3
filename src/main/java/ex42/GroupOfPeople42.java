/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex42;

import java.util.ArrayList;

public class GroupOfPeople42 {
    public ArrayList<Person42> groupList;
    public int numPeople;

    // create constructor with list and list size
    public GroupOfPeople42(ArrayList<Person42> myList){
        this.groupList = myList;
        this.numPeople = myList.size();
    }

    // create function to print to the output file -- take (File output)
    // uhh nvm print to console?
    // function only prints to output, no test required
    public void printAllPeople() {

        // declare printstream
        // print headers
        // loop to print i last name, first name, salary

        System.out.println();

        System.out.format("%-10s%-10s%-10s\n", "Last", "First", "Salary");
        System.out.print("--------------------------\n");
        for(int i = 0; i < this.numPeople; i++){
            Person42 currPerson = this.groupList.get(i);
            System.out.format("%-10s%-10s%-15s\n", currPerson.getLastName(), currPerson.getFirstName(), currPerson.getSalary());
        }
    }
}
