package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {
    // create variables for the prices of the sandwhiches and the discounts
    static double regular;
    static double large;
    static double youngin;
    static double mature;
    static double noDiscount;

    public static void main(String[] args) {
        //insert scanner
        Scanner scanner = new Scanner(System.in);

        //ask user for the size of sandwiches using 1/2
        System.out.println("What size sandwhich do you want to do, Regular(a) or Large(b)?");
        String command = scanner.nextLine();

        // insert if statement to figure out the size of the sandwhich and print out the price
        if (command.equals("regular") || command.equals("a")) {
            regular = 5.45;
            System.out.println("1: Regular: Base price is $5.45");
        } else if (command.equals("large") || command.equals("b")) {
            large = 8.95;
            System.out.println("2: Large: Base price is $8.95");
        } else {
            noDiscount = 0.00;
            System.out.println("Invalid, please try again!");
        }

        // Call ageChecker method
        ageChecker(scanner);

        // Get sandwhichCost method
        sandwhichCost(scanner, regular, youngin, mature, noDiscount);
    }

    public static void ageChecker(Scanner scanner) {

        // prompt user for their age in a new method
        System.out.println("How old are you?");
        Double age = scanner.nextDouble();

        // create if statement to see what discount the user will receive
        if (age <= 17) {
            youngin = 0.10;
            System.out.println("You get a 10% discount");
        } else if (age >= 65) {
            mature = 0.15;
            System.out.println("You get a 15% discount");
        } else {
            noDiscount = 0.00;
            System.out.println("Sorry, you do not get a discount");
        }
    }

    public static void sandwhichCost(Scanner scanner, double regular, double youngin, double mature, double noDiscount) {
       
        // base price for regular and under 17 cost
        double regularYoungin = regular - (regular * youngin);

        // base price for regular and over 65 cost
        double regularMature = regular - (regular * mature);

        // base price for regular and no discount cost
        double regularNoDiscount = regular - (regular * noDiscount);

        // base price for large and under 17 cost
        double largeYoungin = large - (large * youngin);

        // base price for large and over 65 cost
        double largeMature = large - (large * mature);

        // base price for large and no discount cost
        double largeNoDiscount = large - (large * noDiscount);

        // Determine which size and discount apply then print the final price
        double finalPrice = 0;
        
        if (regular > 0) {
            // Regular size was selected
            if (youngin > 0) {
                finalPrice = regularYoungin;
            } else if (mature > 0) {
                finalPrice = regularMature;
            } else {
                finalPrice = regularNoDiscount;
            }
        } else if (large > 0) {
            // Large size was selected
            if (youngin > 0) {
                finalPrice = largeYoungin;
            } else if (mature > 0) {
                finalPrice = largeMature;
            } else {
                finalPrice = largeNoDiscount;
            }
        }

        System.out.println("Your final price is: $" + String.format("%.2f", finalPrice));
    }
}
