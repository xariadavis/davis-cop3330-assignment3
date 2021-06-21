/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {
    Website test = new Website();

    @TempDir
    static File tempHTML;
    static File tempJS;
    static File tempCSS;
    static File tempRoot;


    @Test
    @DisplayName("Should create a new folder with html, JSS, and CSS")
    void createAllDirectories() throws IOException {
        this.test.hasCSS = true;
        this.test.hasJS = true;
        tempRoot = test.createAllDirectories();
        assertTrue(tempRoot.exists());
    }

    @Test
    @DisplayName("Return true if HTML file created")
    void createHTMLDirectory() throws IOException {
        tempHTML = test.createHTMLDirectory();
        assertTrue(tempHTML.exists());
    }

    @Test
    @DisplayName("Return true if JS Folder created")
    void createJSFolder() {
        tempJS = test.createJSFolder();
        assertTrue(tempJS.exists());
    }

    @Test
    @DisplayName("Return true if CSS Folder created")
    void createCSSFolder() {
        tempCSS = test.createCSSFolder();
        assertTrue(tempCSS.exists());
    }
}