package Threads.Ue3;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread t1 = new Thread(worker);

        t1.start();

       if(ConsoleHelper.readLine() != null) {
           worker.requestShutdown();
       }
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread am Ende");
    }
}
