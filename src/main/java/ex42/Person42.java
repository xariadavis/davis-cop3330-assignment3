/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex42;

public class Person42 {
    public String firstName;
    public String lastName;
    public String salary;

    // declare constructor class with name and salary
    public Person42(String fName, String lName, String salary) {
        this.firstName = fName;
        this.lastName = lName;
        this.salary = salary;
    }

    // create getter for first name
    public String getFirstName() {
        return firstName;
    }

    // create getter for last name
    public String getLastName() {
        return lastName;
    }

    // create getter for salary
    public String getSalary() {
        return salary;
    }
}
