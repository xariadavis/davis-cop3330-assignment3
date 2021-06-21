/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex46;

import java.util.ArrayList;

class WordFrequency {
    public ArrayList<Word> words; // list of words
    public int longestWordLength; // the length of the longest word in the list, useful for printing so everything can be padded correctly

    // constructor
    public WordFrequency() {
        this.words = new ArrayList<>();
        this.longestWordLength = 0;
    }


    // checks if word exists
    // @param String word - the word we want to look up
    // @return boolean true/false - true if word exists, else false
    /*
    public Boolean doesWordExist(String word){
        iterate through Word w in "words" and see if we find a match
        if yes return true, else false
        }
     */
    public boolean wordExists(String word) {
        for (Word w : this.words) {
            if (w.getWord().equals(word)) return true;
        }
        return false;
    }

    // finds word in our list of words
    // @param String word - the word we want to look up
    // @return Word - returns the found word
    /*
    public Word findWord(String word){
    return Word if word found
    }
     */
    public Word findWord(String word) {
        for (Word w : this.words) {
            if (w.getWord().equals(word)) return w;
        }
        return null;
    }

    // compares two words, used for sorting
    // @return int - the difference of their frequency
    /*
    public int compareWords(Word w1, Word w2){
        return w2.frequency - w1.frequency
    }
     */
    public int compareWords(Word w1, Word w2) {
        return w2.getFrequency() - w1.getFrequency();
    }

    // reads a word
    // @param String word - the word we want to read
    /*
    public void readWord(String word) {
        check if word exists
        if yes:
            increment the frequency of that word
        if no:
            add the word to our array
    }
     */
    public void readWord(String word) {
        // if the word does not exist, add it to our list with a frequency of one
        if (!wordExists(word)) {
            words.add(new Word(word, 1));

            // also check if it is longer than our longest word and update accordingly
            if (word.length() > this.longestWordLength) {
                this.longestWordLength = word.length();
            }
        } else {
            // else, if the word does exist, find the word in the list and increment its frequency
            findWord(word).incrementFrequency();
        }
    }

    // print the histogram
    /*
    public void printHistogram() {
        iterate over all Word w in words
            print the word with correct padding
            for (int i = 0; i < w.frequency; i++) {
                print a *
            }
    }
     */
    public void printHistogram() {
        // iterate through each word
        for (Word w : this.words) {
            String currentWord = w.getWord() + ":"; // grab the word and puts a ":" at the end of it
            String paddedWord = String.format("%-" + (this.longestWordLength+2) + "s", currentWord); // pad the word to the left side with the appropriate amount of spacing
            System.out.print(paddedWord); // print the padded word

            // print the appropriate number of "*" characters
            for (int i = 0; i < w.getFrequency(); i++) {
                System.out.print("*");
            }

            // prints newline to go to the next line
            System.out.println();
        }
    }

    // sorts our list of Words numerically by frequency
    /*
    public void sortWords() {
        this.words.sort((w1, w2) -> compareWords(w1, w2));
    }
     */
    public void sortWords() {
        this.words.sort(this::compareWords);
    }
}

