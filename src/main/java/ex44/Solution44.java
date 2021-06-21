/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex44;

import java.io.File;
import java.util.Scanner;

public class Solution44 {
    public static void main(String []args) {

        // declare input file
        File inputFile = new File("Input Files/exercise44_input.json");

        // declare new ProductDatabase instance
        ProductDatabase myDatabase = new ProductDatabase(inputFile);

        Boolean productHasBeenFound = false;
        Scanner myObj = new Scanner(System.in);

        /*
        while the product has not been found
            prompt the user fo the product name
            search the database for the product
            print if the product is found
         */
        while (!productHasBeenFound) {
            System.out.print("What is the product name? ");
            String search = myObj.nextLine();
            productHasBeenFound = myDatabase.searchForProduct(search);
        }

        // remember to close the scanner
        myObj.close();
    }
}
