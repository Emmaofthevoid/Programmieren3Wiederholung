package FileIO;

import java.io.*;

public class Uebung7 {
    public static void main(String[] args){
        //writers and readers are declared outside so that you can close it in the finally clause
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            // they are initialised inside the try clause
            fileReader = new FileReader("src\\FileIO\\test.dat");
            bufferedReader = new BufferedReader(fileReader);

            String line;
            //our famous while loop
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            // dont forget to catch the exceptions
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
