package it.saimao;

import java.util.Scanner;

public class L35_NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = sc.nextInt();

        if (grade > 0 && grade <= 10) {
            // Clean data ( 1 - 10 )
            if (grade <= 4) {
                System.out.println("PRIMARY");
            } else if (grade <= 8) { // 5 - 8
                System.out.println("MIDDLE");
            } else {
                System.out.println("HIGH");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
