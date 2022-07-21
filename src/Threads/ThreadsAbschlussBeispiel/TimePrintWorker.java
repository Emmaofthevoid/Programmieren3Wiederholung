package Threads.ThreadsAbschlussBeispiel;

import java.util.Date;

public class TimePrintWorker extends Worker implements Runnable {

    public TimePrintWorker(String name) {
        super(name);
    }


    public void work() {
        printStarted();
        while (shouldRun) {

            Date date = new Date();
            System.out.println(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        printStopped();
    }
    @Override
    public void run() {
        work();
    }
}
