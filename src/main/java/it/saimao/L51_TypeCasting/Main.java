package it.saimao.L51_TypeCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int numInt = Integer.valueOf(number); // String => Primitive
        System.out.println(numInt);

        String numString = String.valueOf(numInt); // Primitive => String
        System.out.println("NumString - " + numString);

    }
}
