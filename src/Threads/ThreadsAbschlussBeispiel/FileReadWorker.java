package Threads.ThreadsAbschlussBeispiel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileReadWorker extends Worker implements Runnable {
    private String path;
    public ArrayList<String> lines;

    public FileReadWorker(String path, String name) {
        super(name);
        this.path = path;
        this.lines = new ArrayList<>();
    }

    public void work() {
        printStarted();
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
                Thread.sleep(1000);

                if (!shouldRun) {
                    break;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        printStopped();
    }

    @Override
    public void run() {
        work();
    }
}
