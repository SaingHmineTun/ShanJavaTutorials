package it.saimao.L52_StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Utils u1 = new Utils();
        u1.number = 1000;
        Utils.incCounter();

        Utils u2 = new Utils();
        u2.number = 2000;
        Utils.incCounter();

        u1.printNumber();
        u2.printNumber();
    }
}
