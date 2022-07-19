package FileIO;

import java.io.*;

public class Uebung15 {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("uebung15.txt");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int byteRead;
            // with read comes always an int, also we need to cast it to a char
            while ((char)(byteRead = System.in.read()) != 'x') {
                bufferedOutputStream.write(byteRead);
            }
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
