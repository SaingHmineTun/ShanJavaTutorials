package it.saimao.L71_ImplementRunnable;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main started");
        Thread thread = new Thread(new Runnable() {
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
        });
        thread.start();
        System.out.println("Main ended");

    }
}
