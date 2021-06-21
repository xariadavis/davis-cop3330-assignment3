/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex46;

class Word {
    public final String word; // the actual word
    public int frequency; // the number of times it appears

    // constructor
    public Word(String word, int frequency) {
        this.word = word;
        this.frequency = frequency;
    }

    // getters
    // get word
    public String getWord() {
        return this.word;
    }

    // get frequency
    public int getFrequency() {
        return this.frequency;
    }

    // increment the frequency of this specific word by 1
    public void incrementFrequency() {
        this.frequency++;
    }
}