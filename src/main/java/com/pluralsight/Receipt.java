package com.pluralsight;

public class Receipt {

    public static void main(String[] args) {

        // Step 3:

        System.out.println();

        // Create variables for an item name and item price
        String itemName = "apples";
        double itemPrice = 3.99;

        // Create a quantity variable
        int numberOfItems = 6;

        // Build and print
        System.out.println("You purchased " + numberOfItems + " " + itemName + " for $" + itemPrice + ".");
    }
}
