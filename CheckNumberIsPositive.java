package checkingNumber;

import java.util.Scanner;

public class CheckNumberIsPositive {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Declare a variable to store the number entered by the user
        int number;
        
        // Print a welcome message
        System.out.println("Welcome to the number check program");
        
        // Prompt the user to enter a number
        System.out.println("Please enter a number:");
        number = input.nextInt(); // Read the number entered by the user
        
        // Check whether the number is positive or negative
        if (number > 0) {
            // If the number is positive, check whether it's even or odd
            if (number % 2 == 0) {
                // If the number is even, print a message indicating it's positive and even
                System.out.println(number + " is positive and even.");
            } else {
                // If the number is odd, print a message indicating it's positive and odd
                System.out.println(number + " is positive and odd.");
            }
        } else {
            // If the number is negative, check whether it's even or odd
            if (number % 2 == 0) {
                // If the number is even, print a message indicating it's negative and even
                System.out.println("Number " + number + " is negative and even.");
            } else {
                // If the number is odd, print a message indicating it's negative and odd
                System.out.println("Number " + number + " is negative and odd.");
            }
        }
        
        input.close();
    }
}
