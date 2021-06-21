/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex43;

/*
Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 */

import java.io.IOException;

public class Solution43 {

    public static void main(String[] args) throws IOException {

        // declare Website site = new Website
        Website mySite  = new Website();

        // call site.setSiteName to get user input for site name
        mySite.setSiteName();

        // call site.setAuthorName to get user input for author name
        mySite.setAuthorName();

        // call promptForJS to get user input for JS or no JS
        mySite.promptForJS();

        // call promptForCSS to get user input for CSS or no CSS
        mySite.promptForCSS();

        // call createAll directories to create directories based on the user responses
        mySite.createAllDirectories();

        // remember to close the scanner
        mySite.closeScanner();

    }
}
