package it.saimao.L70_Thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread Started");

        Thread thread = new Downloader();
        thread.start();

        System.out.println("Main thread Ended");

    }

}
