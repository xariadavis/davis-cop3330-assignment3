/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex41;

public class Person {

    // declare variables for first and last name
        // public string firstname
        // public string lastname
    public String firstName;
    public String lastName;

    // create constructor
    // public Person(fname, lname)
        // this.firstname = fname
        // this.lastname = lname
    public Person(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }

    // create getter for firstName
    public String getFirstName() {
        return this.firstName;
    }

    // create getter for lastName
    public String getLastName() {
        return this.lastName;
    }
}
