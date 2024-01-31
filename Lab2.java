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

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int num = rand.nextInt(100);
                if (num < 10) {
                    System.out.print("0" + num + " ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\n------------------------------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.println("$" + prize);
        System.out.println("------------------------------------");
        System.out.println("\n\n\n\nThank you for buying a lottery ticket from Nana's and Ale's program :)");
    }
}
