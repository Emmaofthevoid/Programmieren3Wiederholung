package Threads.ThreadsAbschlussBeispiel;

public class Worker {
    protected String name;
    protected boolean shouldRun;

    public Worker(String name) {
        this.name = name;
        this.shouldRun = true;
    }

    protected void printStarted () {
        System.out.println(name + " wurde gestarted");
    }

    protected void printStopped () {
        System.out.println(name + " wurde gestoppt");
    }

    public void stopWorker () {
        shouldRun = false;
    }


}
