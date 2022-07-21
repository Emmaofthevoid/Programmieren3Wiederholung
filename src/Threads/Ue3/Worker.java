package Threads.Ue3;

import java.util.Date;

public class Worker implements Runnable {

    public boolean isRunning = true;
            int sleepInterval = 1000;
    public void requestShutdown() {
        isRunning = false;
    }

    @Override
    public void run() {

        while (isRunning) {
            try {
                Date date = new Date();
                System.out.println(date);
                Thread.sleep(sleepInterval);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
