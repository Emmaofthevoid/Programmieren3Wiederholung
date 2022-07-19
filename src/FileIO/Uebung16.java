package FileIO;

import java.io.*;

public class Uebung16 {
    public static void main(String[] args) {
        String text = "Hallo World";
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("object.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            fileInputStream = new FileInputStream(text);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
