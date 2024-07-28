package it.saimao;

public class L33_BreakTheLoop {
    public static void main(String[] args) {

        System.out.println("Loop started");
        for (int i = 0; i <= 50; i += 2) {
            System.out.println(i);
            if (i == 30) break;
        }
        System.out.println("Loop ended");

    }
}
