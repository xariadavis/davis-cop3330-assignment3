/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution46 {
    public static void main(String []args) {
        //File inputFile = the input file
        File inputFile = new File("Input Files/exercise46_input.txt"); // grabs input file
        // Scanner scan
        Scanner myObj;

        // tries to make a Scanner from the input file
        // if we encounter a FileNotFoundException, return

        /*
          try {
            scan = new Scanner (inputFile)
        } catch (FileNotFoundException) {
            print that the file has not been found
            return
        }
         */

        try {
            myObj = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found. Please ensure file is named [exercise46_input.txt].");
            return;
        }

        WordFrequency myWords = new WordFrequency();

        // reads all the words in our list

        /*
         while(scanner has next){
            read next word and add to myWords
         */

        while (myObj.hasNext()) {
            myWords.readWord(myObj.next());
        }

        // sort words
        myWords.sortWords();

        // print histogram
        myWords.printHistogram();

        // close scanner
        myObj.close();
    }
}
