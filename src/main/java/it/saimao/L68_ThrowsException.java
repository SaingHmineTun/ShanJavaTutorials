package it.saimao;

public class L68_ThrowsException {
    public static void main(String[] argsd) {
        System.out.println("Started");

        try {
            sleepFor1Second();
        } catch (InterruptedException e) {
            System.out.println("Cannot sleep!");;
        }
        System.out.println("Ended");

    }

    public static void sleepFor1Second() throws InterruptedException {
            Thread.sleep(1000);
    }
}
