package Threads.ThreadsAbschlussBeispiel;

public class Main {
    public static void main(String[] args) {
        TimePrintWorker timePrintWorker = new TimePrintWorker("Manolito");
        FileReadWorker fileReadWorker = new FileReadWorker("uebung9.txt", "Lolita");

        Thread timeThread = new Thread(timePrintWorker);
        Thread fileThread = new Thread(fileReadWorker);

        fileThread.start();
        fileThread.start();

        try {
            fileThread.join();
            timePrintWorker.stopWorker();
            timeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Thread am Ende");
    }
}
