package it.saimao.L70_Thread;

public class Downloader extends Thread {

    @Override
    public void run() {
        System.out.println("Downloader started");
        boolean bool = true;
        while (bool) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Downloading...");
        }
        System.out.println("Downloader ended!");
    }
}
