package it.saimao;

public class L72_JoinThread {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main started");

        class Worker extends Thread {
            String name;

            Worker(String name) {
                this.name = name;
            }

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(name + " " + i);
                }
            }
        }

        Thread th1 = new Worker("Thread1");
        th1.start();
        Thread th2 = new Worker("Thread2");
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Main ended");

    }
}
