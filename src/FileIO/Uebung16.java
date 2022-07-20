package FileIO;

import java.io.*;

public class Uebung16 {
    public static void main(String[] args) {
        String text = "Hallo World";
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream = null;
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("object2.dat");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            fileInputStream = new FileInputStream("object2.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);

            objectOutputStream.writeObject(text);
            objectOutputStream.flush();

            String finalText = (String) objectInputStream.readObject();

            System.out.println(finalText);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
