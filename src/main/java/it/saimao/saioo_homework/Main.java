package it.saimao.saioo_homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.print("Enter your name: ");
            String inputName = scanner.nextLine();
            System.out.print("Enter your pin: ");
            String inputPin = scanner.nextLine();

            if (atm.authenticate(inputName, inputPin)) {
                System.out.printf("Welcome to %s ATM.%n",inputName);

                while (true) {
                    System.out.println("Please select an option: ");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Info");
                    System.out.println("4. Exit");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            atm.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            atm.withdraw(withdrawAmount);
                            break;
                        case 3:
                            atm.showInfo();
                            break;
                        case 4:
                            atm.exit();
                            return;
                        default:
                            System.out.println("Invalid option. Please try again!");
                    }
                }

            }else {
                System.out.println("Invalid input. Please try again!");
            }
        }

    }
}