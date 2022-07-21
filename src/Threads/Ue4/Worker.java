package Threads.Ue4;

public class Worker implements Runnable {
    int sleepInterval = 100;
    int counter = 0;
    Object lock = new Object();

    @Override
    public void run() {

        synchronized (lock) {
            while (counter <= 20) {
                lock.notify();
                System.out.println(Thread.currentThread().getName() + " " + counter);
                counter++;
                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                lock.notifyAll();
            }
        }
    }
}
