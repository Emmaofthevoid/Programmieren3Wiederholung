package Threads.Ue3.Erweitert;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Thread thread = new Thread(worker);
        Thread thread1 = new Thread(worker);

        thread.start();
        thread1.start();

        if (ConsoleHelper.readLine() != null) {
            worker.requestShutDown();
        }

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread am Ende");


    }
}
