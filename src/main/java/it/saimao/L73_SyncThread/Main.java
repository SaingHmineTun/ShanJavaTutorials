package it.saimao.L73_SyncThread;

public class Main {

    /*
    1) LOCK
    2) UPDATE
    3) UNLOCK
     */

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.init();
    }

    private int counter;

    private synchronized void incCounter() {
        counter ++;
    }

    private void increaseCounter() {
        synchronized (this) {
            counter ++;
        }

    }

    private void init() throws InterruptedException {

        class Worker extends Thread {
            public void run() {
                for (int i = 0; i < 200_000; i++) {
                    increaseCounter();
                }
            }
        }
        var w1 = new Worker();
        w1.start();
        var w2 = new Worker();
        w2.start();

        var w3 = new Worker();
        w3.start();


        w1.join();
        w2.join();
        w3.join();

        System.out.println("Counter - " + counter);

    }


}
