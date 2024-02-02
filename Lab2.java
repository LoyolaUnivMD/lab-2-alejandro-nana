// Programmers:  Nana and Alejandro
// Course:  CS 212
// Due Date: 02/04/24
// Lab Assignment: 2
// Problem Statement: Your program needs to prompt the player for their name and generate 10 random lottery tickets
// Data In: Customer name
// Data Out: Lottery tickets and prize

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

class Lab2 {
    public static void main(String[] args) {
        // Declaring winning numbers
        int[] winningNumbers = {3, 5, 16, 58, 59, 11};

        // Creating tools for input, random numbers, and formatting
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        DecimalFormat ticketIntFormat = new DecimalFormat( "##" );
        DecimalFormat prizeFormat = new DecimalFormat( "##.00" );

        // Outputting purpose to the user
        System.out.println("\n\nCS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");

        // Requesting the customer's name
        System.out.println("What's your name? ");
        String customerName = input.nextLine();
        customerName = customerName.strip();

        // Requesting the customer's bet
        System.out.println("How much do you want to play? ");
        double prize = input.nextDouble();

        // Outputting the player's decisions
        System.out.println("\nGreat! " + customerName + " wants to play $" + prizeFormat.format(prize));
        System.out.print("\n\n");

        // Generating an array of arrays where each (internal) array is a ticket.
        int[][] tickets = new int[][] {
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
                {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)},
        };

        // Letting the customer know the system is about to print their tickets
        System.out.println("Here are your tickets:");
        System.out.println("\n — — — — — — — — — — — — \n|                       |");

        // Declaring isWinner variable
        boolean isWinner;

        // Checking for winners and outputting tickets
        for (int i = 0; i < 10; i++) { // Iterating over tickets

            // For aesthetics
            System.out.print("|  ~ ");

            for (int j = 0; j < 6; j++) { // Iterating over numbers within a ticket

                // Checking if the number is a winner
                isWinner = false;
                for (int k = 0; k < 6; k++) {isWinner = isWinner || tickets[i][j] == winningNumbers[k];}
                //prize = (tickets[i][j] == winningNumbers[j]) ? Math.pow(prize, 1.75) : prize; // Better way of checking

                // If the number is a winner, increase prize
                prize = (isWinner) ? Math.pow(prize, 1.75) : prize;

                // Formatting and outputting ticket
                String formatter = (tickets[i][j] < 10) ? "0" : "";
                System.out.print(formatter + ticketIntFormat.format(tickets[i][j]) + " ");
                //System.out.print(ticketIntFormat.format(tickets[i][j]) + " "); // I tried >:|
            }

            // For aesthetics
            System.out.print(" |\n");

        }
        // For aesthetics
        System.out.println("|                       |\n — — — — — — — — — — — — ");

        // Program prints out a good luck message and outputs the estimated jackpot.
        System.out.println("\n\n\n---------------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("---------------------");
        System.out.println("Your winnings are:");
        System.out.println("$" + prizeFormat.format(prize));
        System.out.println("---------------------");

        // Thank you message
        System.out.println("\n\n\n\nThank you for buying a lottery ticket from Nana's and Ale's program :)");
    }
}
