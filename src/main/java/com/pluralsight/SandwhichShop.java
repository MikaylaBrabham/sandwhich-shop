package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {
    // create variables for the prices of the sandwhiches and the discounts
    static double regularPrice = 5.45;
    static double largePrice = 8.95;
    static double loadedExtraRegular = 1.00;
    static double loadedExtraLarge = 1.75;

    public static void main(String[] args) {
        //insert scanner
        Scanner scanner = new Scanner(System.in);

        //ask user for the size of sandwiches using 1/2
        System.out.println("What size sandwhich do you want to do, Regular(a) or Large(b)?");
        String command = scanner.nextLine().toLowerCase();

        double basePrice = 0;
        boolean isLarge = false;

        // insert if statement to figure out the size of the sandwhich and print out the price
        if (command.equals("regular") || command.equals("a")) {
            basePrice = regularPrice;
            System.out.println("1: Regular: Base price is $" + String.format("%.2f", basePrice));
        } else if (command.equals("large") || command.equals("b")) {
            basePrice = largePrice;
            isLarge = true;
            System.out.println("2: Large: Base price is $" + String.format("%.2f", basePrice));
        } else {
            System.out.println("Invalid, please try again!");
            return;
        }

        // Call ageChecker method
        double discount = ageChecker(scanner);

        // Call loadedSandwhich method
        double extra = loadedSandwhich(scanner, isLarge);

        basePrice += extra;

        // Get sandwhichCost method
        sandwhichCost(basePrice, discount);
    }

    public static double ageChecker(Scanner scanner) {

        // prompt user for their age in a new method
        System.out.println("How old are you?");
        String ageStr = scanner.nextLine();
        double age = Double.parseDouble(ageStr);

        // create if statement to see what discount the user will receive
        if (age <= 17) {
            System.out.println("You get a 10% discount");
            return 0.10;
        } else if (age >= 65) {
            System.out.println("You get a 15% discount");
            return 0.15;
        } else {
            System.out.println("Sorry, you do not get a discount");
            return 0.00;
        }
    }
    public static double loadedSandwhich(Scanner scanner, boolean isLarge) {
        // ask if user wants their sandwhich loaded
        System.out.println("Do you want your sandwhich loaded? (yes/no)");
        String loadedCommand = scanner.nextLine().toLowerCase();

        double extra = 0;

        // create a method for the loaded sandwhich and print out the price
        if (loadedCommand.equals("yes")) {
            if (isLarge) {
                extra = loadedExtraLarge;
            } else {
                extra = loadedExtraRegular;
            }
            double loadedPrice = (isLarge ? largePrice : regularPrice) + extra;
            System.out.println("Loaded " + (isLarge ? "Large" : "Regular") + ": Base price is $" + String.format("%.2f", loadedPrice));
        } else if (loadedCommand.equals("no")) {
            // insert else statement for user not wanting loaded sandwhich
            System.out.println("You chose not to load your sandwhich");
        } else {
            // insert else statement for invalid input
            System.out.println("Invalid, please try again!");
        }
        return extra;
    }

    public static void sandwhichCost(double basePrice, double discount) {
       // print out the final price of the sandwhich after applying the discount
        double finalPrice = basePrice * (1 - discount);

        System.out.println("Your final price is: $" + String.format("%.2f", finalPrice));
    }
}
