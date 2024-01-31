// Programmers:  [your names here]
// Course:  CS 212
// Due Date:
// Lab Assignment:
// Problem Statement:
// Data In:
// Data Out:
// Credits: [Is your code based on an example in the book, in class, or something else?
//            Reminder: you should never take code from the Internet or another person

import java.util.Scanner;
import java.util.Random;

class Lab2 {
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
// Program states the purpose to the user
        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        //Program request the user Name
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        for (int i = 0; i < 10; i++) { //Ten rows of random numbers are set
            for (int j = 0; j < 6; j++) { //six number set to be in each row
                int num = rand.nextInt(100); // A random number out of 100 is pulled 
                if (num < 10) {  //if the number is less than 10, a zero is placed in front of it
                    System.out.print("0" + num + " ");
                } else { // if anything else the number runs
                    System.out.print(num + " ");
                }
            }
            System.out.print("\n");
        }
//program prints out the good luck message and fetches the customers name variable
        System.out.println("\n------------------------------------");
        System.out.println("Good luck " + customerName + "!"); 
        System.out.println("Estimated Jackpot:");
        System.out.println("$" + prize); //the prize variable is pulled
        System.out.println("------------------------------------");
        System.out.println("\n\n\n\nThank you for buying a lottery ticket from Nana's and Ale's program :)");
    }
}
//The final message is sent out, with the estimated prize amount, users name, and ends with thanking the user
