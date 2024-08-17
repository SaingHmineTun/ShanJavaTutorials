package it.saimao.L52_StaticKeyword;

public class Main {
    public static void main(String[] args) {
        Utils u1 = new Utils();
        Utils.incCounter();
        u1.number = 1000;

        Utils u2 = new Utils();
        Utils.incCounter();
        u2.number = 2000;

        u1.printNumber();
        u2.printNumber();
    }
}
