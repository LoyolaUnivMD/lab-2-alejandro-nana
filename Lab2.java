// Programmers:  Nana and Alejandro 
// Course:  CS 212
// Due Date: 02/04/24
// Lab Assignment: 2
// Problem Statement: Your program needs to prompt the player for their name and generate 10 random lottery tickets
// Data In: Customer name
// Data Out: Lottery tickets and prize

import java.util.Scanner;
import java.util.Random;

class Lab2 {
    public static void main(String[] args) {
        // Declaring prize
        long prize = 225938745L;

        // Creating tools for input and random numbers
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Outputting purpose to the user
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        // Requesting the customer's name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();
        customerName = customerName.strip();
        
        
        for (int i = 0; i < 10; i++) { // Ten tickets are going to be outputted

            // Generating a single ticket
            for (int j = 0; j < 6; j++) {
                int num = rand.nextInt(100); // A random number out of 100 is pulled 
                
                // If the number is less than 10, a zero is placed in front of it and then added to the ticket
                if (num < 10) { 
                    System.out.print("0" + num + " ");
                } else { // If it is anything else the number is simply added to the ticket
                    System.out.print(num + " ");
                }
                
            }
            System.out.print("\n");
        }
        
        // Program prints out a good luck message and outputs the estimated jackpot.
        System.out.println("\n------------------------------------");
        System.out.println("Good luck " + customerName + "!"); 
        System.out.println("Estimated Jackpot:");
        System.out.println("$" + prize);
        System.out.println("------------------------------------");
        System.out.println("\n\n\n\nThank you for buying a lottery ticket from Nana's and Ale's program :)");
    }
}
//The final message is sent out, with the estimated prize amount, users name, and ends with thanking the user
