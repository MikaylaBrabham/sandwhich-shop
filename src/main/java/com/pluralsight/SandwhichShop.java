package com.pluralsight;

import java.util.Scanner;

public class SandwhichShop {
    public static void main(String[] args) {
        //insert scanner
        Scanner scanner = new Scanner(System.in);

        //ask user for the size of sandwiches using 1/2
        System.out.println("What size sandwhich do you want to do, Regular(a) or Large(b)?");
        String command = scanner.nextLine();

        // insert if statement to figure out the size of the sandwhich and print out the price
        if (command.equals("regular") || command.equals("a")) {
            double regular = 5.45;
            System.out.println("1: Regular: Base price is $5.45");
        } else if (command.equals("large") || command.equals("b")) {
            double large = 8.95;
            System.out.println("2: Large: Base price is $8.95");
        } else {
            System.out.println("Invalid, please try again!");
        }
    }
public static void ageChecker(Scanner scanner) {

    // prompt user for their age in a new method
    System.out.println("How old are you?");
    Double Command = scanner.nextDouble();

    // create if statement to see what discount the user will receive
    if (Command <= 17) {
        double youngin = 0.10;
        System.out.println("You get a 10% discount");
    } else if (Command >= 65) {
        double mature = 0.15;
        System.out.println("You get a 15% discount");
    } else {
        System.out.println("Sorry, you do not get a discount");
    }
}
    // display the cost of the sandwhich
    public static void sandwhichCost(main, ageChecker) {
        // base price for regular and under 17 cost

        // base price for regular and over 65 cost

        // base price for regular and no discount cost

        // base price for large and under 17 cost

        // base price for large and over 65 cost

        // base price for large and no discount cost

    } {

    }
}
