package it.saimao;

import java.util.Scanner;

public class L19_ReadInputWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name!");
        String name = sc.nextLine();
        System.out.printf("My name is %s", name);
    }
}
