package FileIO;

import java.io.*;

public class Uebung13 {
    public static void main(String[] args) {
        //there is a buffered input stream, who would have thought
        FileInputStream fileInputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            fileInputStream = new FileInputStream("uebung9.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int byteRead;
            int count = 0;

            while ((byteRead = bufferedInputStream.read()) != -1) {
                //you can cast int to char, easy peasy
                if((char) byteRead != ' ') {

                    count++;
                }
                System.out.print((char) byteRead);
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
