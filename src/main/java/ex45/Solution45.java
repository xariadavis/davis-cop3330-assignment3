/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Solution45 {
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // declare instance variables
        Solution45 myApp = new Solution45();
        WordFinder word = new WordFinder();

        // prompt for outFile name
        String outputName = myApp.promptForOutName();

        // add to outfile name
        File output = new File("Output Files/" + outputName + ".txt");

        // declare input file
        File input = new File("Input Files/exercise45_input.txt");

        // String before = read initial string -- to use for word replacement function
        String outputBefore = myApp.readInputFile(input);

        // String after = string after word replacement
            // pass before into replacement function
        String outputAfter = word.replaceUtilize(outputBefore);

        // print to output file
        myApp.printOutput(output, outputAfter);
    }

    // only scans, no test required
    private String readInputFile(File fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(String.valueOf(fileName))));
    }

    // only scans, no test required
    private String promptForOutName(){
        System.out.print("What would you like to name the output file? ");
        return myObj.nextLine();
    }

    // only prints? no test required
    private void printOutput(File output, String outputContent) throws FileNotFoundException {
        PrintStream outputFile = new PrintStream(output);
        outputFile.print(outputContent);
    }
}
