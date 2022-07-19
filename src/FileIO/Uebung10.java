package FileIO;

import java.io.*;

public class Uebung10 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader = null;
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("uebung10.txt");
            //we give the system in bc we need a scanner
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line;

            // != null is fr when it reads from a file, damit it stops after reading whole content
            while (!(line = bufferedReader.readLine()).equals("stop")) {

                System.out.println(line);
                fileWriter.write(line);
                //um eine neue zeile zu machen
                fileWriter.write("\n");

            }
            // flush outside of the while loop, and very important.
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
