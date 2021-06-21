/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex44;

class Product {
    private String name;
    private final double price;
    private final int quantity;

    // getter for the name
    public String getName() {
        return this.name;
    }

    // setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // constructor for Product
        // name, price, and quantity
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // just prints, no test required
    // print function
        /*
        sout(name)
        sout(price)
        sout(quantity)
         */
    public void printProduct() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
}