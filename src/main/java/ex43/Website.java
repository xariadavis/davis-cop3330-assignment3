/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Website {
    private static final Scanner myObj = new Scanner(System.in);

    // String website name
    public String siteName;

    // String author name
    public String author;

    // bool has CSS
    public boolean hasCSS;

    // bool has JSS
    public boolean hasJS;

    // File for each of the Dir -- root, html, js, css
    File rootDir;
    File htmlFile;
    File jsFolder;
    File cssFolder;

    // constructor with no parameters to create empty site
    public Website() {
    }


    // prompt user for site and set name
    // only scans, no test required
    public void setSiteName() {
        System.out.print("Site name: ");
        this.siteName = myObj.nextLine();
    }

    // prompt user for author name and set author name
    // only scans, no test required
    public void setAuthorName() {
        System.out.print("Author: ");
        this.author = myObj.nextLine();
    }

    // only scans, no test required
    public void promptForCSS() {
        //ask user if they want css
        System.out.print("Do you want CSS? ");

        if (myObj.nextLine().matches("(?i)y|yes")){
            this.hasCSS = true;
        }
        // if yes
            // set this.boolean to true
        // if no
            // set this.boolean to false
        // do you want css?
            // no i do not want CSS
        // do you want js?
            // yes
    }

    // only scans, no test required
    public void promptForJS() {
        //same as promptForCSS
        System.out.print("Do you want JS? ");
        if (myObj.nextLine().matches("(?i)y|yes")){
            this.hasJS = true;
        }
    }

    // creates directories based on user input
    public File createAllDirectories() throws IOException {
        // create main folder/root directory
        // new File("./website/").mkdirs();
        this.rootDir = new File("./website/" + this.siteName + "/");
        this.rootDir.mkdirs();
        System.out.format("Created ./website/%s\n", this.siteName);


        // create html file (probably separate method)
        createHTMLDirectory();

        // if CSS boolean is true, create CSS directory. else do nothing
            // could create separate method for this
            // either have the code here raw
            // or call createCSSDirectory()

        // if JS boolean is true, create JS directory. else do nothing
            // could create separate method for this

        if(hasJS){ createJSFolder(); }
        if(hasCSS){ createCSSFolder(); }

        // after each of these, print statement saying they were created
        return this.rootDir;
    }

    public File createHTMLDirectory() throws IOException {

        // create HTMl file
        this.htmlFile = new File(this.rootDir, "index.html");
        this.htmlFile.createNewFile();

        // String htmlInfo to hold siteName and authorName
        String HTMLInfo = "<html><head><title>" +
                this.siteName +
                "</title>" +
                "<meta name= \"author\" content= \"" + this.author + "\"/>" +
                "</head>" +
                "</html>";

        // write to output using BufferedWriter / PrintStream stuff
        BufferedWriter bw = new BufferedWriter(new FileWriter(this.htmlFile));
        bw.write(HTMLInfo);
        bw.close();

        // sout statement saying the html was created
        System.out.format("Created ./website/%s/index.html\n", this.siteName);
        return this.htmlFile;
    }

    public File createJSFolder() {

        // create jc folder in root directory
        this.jsFolder = new File(this.rootDir, "/js/");
        this.jsFolder.mkdirs();

        // sout that a js folder was created
        System.out.format("Created ./website/%s/js/\n", this.siteName);
        return this.jsFolder;
    }

    public File createCSSFolder() {

        // create css folder in root directory
        this.cssFolder = new File(this.rootDir, "/css/");
        this.cssFolder.mkdirs();

        // sout that css folder was created
        System.out.format("Created ./website/%s/css/\n", this.siteName);
        return this.cssFolder;
    }

    // method to close scanner -- call at the end of main?
    // don't think i need to test -- involves scanner
    public void closeScanner() {
        myObj.close();
    }
}
