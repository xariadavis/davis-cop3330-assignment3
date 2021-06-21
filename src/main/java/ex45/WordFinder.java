/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */

package ex45;

public class WordFinder {
    // declare constructor
    public WordFinder() {
    }

    // function to replace utilize with use -- pass in String input
    public String replaceUtilize(String input) {
        // declare string to store new content with replacement
        String str;
        // string = call replace all and replace
        str = input.replaceAll( "utilize" , "use" );
        // return the string
        return str;
    }
}
