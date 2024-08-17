package it.saimao.saioo_homework;

import java.util.Scanner;

public class ATM {
    private String name = "Sai Mao";
    private String pin = "Asd123456!";
    private double amount = 100000.00;

    public boolean authenticate(String inputName, String inputPin) {
        return inputName.equals(name) && inputPin.equals(pin);
    }

    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful. Current balance: " + amount);
    }

    public void withdraw(double withdrawAmount) {
        Scanner scanner = new Scanner(System.in);
        while (withdrawAmount > amount) {
            System.out.print("Insufficient Amount. Please renter new amount: ");
            withdrawAmount = scanner.nextDouble();
        }
        amount -= withdrawAmount;
        System.out.println("Withdraw successful. Current balance: " + amount);
    }

    public void showInfo() {
        System.out.println("Account Name: " + name);
        System.out.println("Current Balance: " + amount);
    }

    public void exit() {
        System.out.println("Exiting the ATM. Have a nice day!");
    }
}
