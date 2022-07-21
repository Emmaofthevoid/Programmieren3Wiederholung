package Threads.Ue3.Erweitert;

import java.util.Date;

public class Worker implements Runnable {

    int sleepInterval = 1000;
    boolean isRunning = true;
    Object lock = new Object();

    public void requestShutDown() {
        isRunning = false;
    }

    @Override
    public void run() {

        synchronized (lock) {
            while (isRunning) {
                Date d = new Date();
                System.out.print("[");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println();
                System.out.println();

                try {
                    Thread.sleep(sleepInterval);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
