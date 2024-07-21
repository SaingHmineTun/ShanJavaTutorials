package it.saimao;

import java.util.Scanner;

public class L22_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age!");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You're not allowed!");
        } else {
            System.out.println("Please choose your brand");
        }
    }
}
