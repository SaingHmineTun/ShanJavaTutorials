package it.saimao.L52_StaticKeyword;

/*
Non-access modifier
 */
public class Utils {
    public int number = 123;
    public static int counter; // class level

    public void printNumber() {
        System.out.println("Number is - " + number);
        System.out.println("Counter - " + counter);
    }

    public static void incCounter() {
        counter++;
    }
}
