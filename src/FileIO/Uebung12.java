package FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Uebung12 {
    public static void main(String[] args) {
        File file = new File("uebung9.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            int byteRead;
            // -1 instead of null bc its what it returns when the end of the file has been reached.
            while ((byteRead = fileInputStream.read()) != -1) {

                //toChars methode gives an array back, and we print at position 0 bc it saves only one each loop.
                //   char[] ch = Character.toChars(byteRead);

                char c = (char) byteRead;
                System.out.println((char) byteRead);
                System.out.print(c);
            }

            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
