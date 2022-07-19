package FileIO;

import java.io.*;

public class Uebung9 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            //File writer first print writer danach
           fileWriter = new FileWriter("uebung9.txt");
             printWriter = new PrintWriter(fileWriter);

             printWriter.println("hola que pasa amigos");
             printWriter.println();
             printWriter.println();
             printWriter.println("yessssss");
             // flush we do inside try clause as well
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            printWriter.close();
        }

    }
}
