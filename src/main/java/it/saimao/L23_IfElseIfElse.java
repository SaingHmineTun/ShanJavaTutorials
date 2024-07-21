package it.saimao;

import java.util.Scanner;

public class L23_IfElseIfElse {
    public static void main(String[] args) {
        System.out.println("Enter student's grade");
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        if (grade >= 1 && grade <= 4) {
            System.out.println("Go to primary school department");
        } else if (grade > 4 && grade <= 8) {
            System.out.println("Go to middle school department");
        } else if (grade == 9 || grade == 10) {
            System.out.println("Go to high school department");
        } else {
            System.out.println("Invalid input!");
        }
    }
}
/*
HOME WORK
String serverEmail => admin@gmail.com
String serverPassword => 123456@%

Enter your email => yourEmail
Enter your password => yourPassword

severEmail = yourEmail and serverPassword = yourPassword => Login success
serverEmail = yourEmail and serverPassword != yourPassword => Incorrect password
serverEmail != yourEmail and serverPassword == yourPassword => Incorrect email
serverEmail != yourEmail and serverPassword != yourPassword => Login failed

 */