package it.saimao;

import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        while (true) {

            Random random = new Random();
            int number = random.nextInt(6) + 1; // 1 to 6

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number between 1 and 6");
            int myGuess = sc.nextInt();
            if (myGuess >= 0 && myGuess <= 6) {
                if (number == myGuess) {
                    System.out.printf("Dice - %d%nYour guess - %d%n", number, myGuess);
                    System.out.println("You won!");
                    break;
                } else {
                    System.out.printf("Dice - %d%nYour guess - %d%n", number, myGuess);
                    System.out.println("Try again");
                }
            } else {
                System.out.println("Try again");
            }
        }


    }
}
