/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Xaria Davis
 */


package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

class ProductDatabase {
    // declare product database
    private final HashMap<String, Product> database;

    // constructor
    public ProductDatabase(File inputFile) {
        this.database = new HashMap<>();

        // store products in a JsonArray using GSON -- try catch?
        // maybe;
            /*
          try {
            for (JsonElement e in jsonProductsArray) {
                get name, price, and quantity from JsonElement e
                create a product based on this information
                put it in hashmap
            }
        } catch (file not found) {
            print that the file has not been found
        }
             */

        try {
            JsonElement jsonFile = JsonParser.parseReader(new FileReader(inputFile));
            JsonObject fileObject = jsonFile.getAsJsonObject();
            JsonArray jsonProductsArray = fileObject.get("products").getAsJsonArray();

            for (JsonElement e : jsonProductsArray) {
                JsonObject productObject = e.getAsJsonObject();
                String name = productObject.get("name").getAsString();
                double price = productObject.get("price").getAsDouble();
                int quantity = productObject.get("quantity").getAsInt();

                Product product = new Product(name, price, quantity);
                this.database.put(name, product);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found. Please ensure file is named [exercise44_input.json].");
        }

    }

    // search for product
    public boolean searchForProduct(String search) {

        /*
        if database contains the search strong
            grab the product
            print the product
            return true to indicate that the product has been found
         else
            print that the product has not been found
            return false to indicate that the product has not been found
         */

        if (this.contains(search)) {
            Product found = this.database.get(search);
            found.printProduct();
            return true;
        } else {
            System.out.println("Sorry, that product was not found in our inventory.");
            return false;
        }
    }

    // return true if contains search
    public boolean contains(String search) {
        return this.database.containsKey(search);
    }
}
