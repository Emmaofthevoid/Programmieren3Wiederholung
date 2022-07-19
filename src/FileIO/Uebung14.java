package FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Uebung14 {
    public static void main(String[] args) {

        File file = new File("uebung9.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            String outputText = "Hello darkness my old friend";

            for (char c: outputText.toCharArray()) {
                fileOutputStream.write(c);
            }
            fileOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
