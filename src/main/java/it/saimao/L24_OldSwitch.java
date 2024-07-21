package it.saimao;

import java.util.Scanner;

public class L24_OldSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade!");
        String grade = sc.next();
        switch (grade) {
            case "1", "2", "3", "4":
                System.out.println("Go to primary school department");
                break;
            case "5", "6", "7", "8":
                System.out.println("Go to middle school department");
                break;
            case "9", "10":
                System.out.println("Go to high school department");
                break;
            default: // else in if statement
                System.out.println("Invalid input");
        }
    }
}
