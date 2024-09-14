package it.saimao.L64_Enumeration;

public class Main {
    public static void main(String[] args) {
        printMonthName(100);
        Month month = Month.JUN;
        printMonthName(month);
        printMonthName(Month.JAN);
    }

    // month 1 to 12
    public static void printMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June"};
        int index = --month;
        if (index >= 0 && index < 12) {
            System.out.println(months[index]);
        } else {
            System.out.println("Invalid input!");
        }
    }

    public static void printMonthName(Month month) {
        System.out.println(month.getName());
    }
}
