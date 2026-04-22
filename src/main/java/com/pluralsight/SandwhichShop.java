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
            System.out.println("1: Regular: Base price is $5.45");
        } else if (command.equals("large") || command.equals("b")) {
            System.out.println("2: Large: Base price is $8.95");
        }
    }
public static void ageChecker(Scanner scanner) {

        // prompt user for their age in a new method

    }
}
