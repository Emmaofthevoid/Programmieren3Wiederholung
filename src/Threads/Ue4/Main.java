package Threads.Ue4;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        Thread thread1 = new Thread(worker);

        thread.start();
        thread1.start();

        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread am Ende");
    }
}
