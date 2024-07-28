package it.saimao;

import java.util.Scanner;

public class L36_Login {
    public static void main(String[] args) {

        String serverEmail = "sai@gmail.com";
        String serverPassword = "1234@";

        boolean repeat = true;

        while (repeat) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your email : ");
            String email = sc.nextLine();
            System.out.print("Enter your password : ");
            String password = sc.nextLine();

            if (serverEmail.equals(email) && serverPassword.equals(password)) {
                System.out.println("Login success");
                repeat = false;
            } else {
                System.out.println("Try again!");
            }
        }

    }
}
