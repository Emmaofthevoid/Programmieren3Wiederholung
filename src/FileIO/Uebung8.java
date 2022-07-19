package FileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uebung8 {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader = null;

        try {
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("Please write something, thanks.");
            String line;
            // we initialise "line" in the condition of the while loop bc otherwise it gets recursive and weird,
            //and like this it asks he user every time for a new eingabe.
            while (!(line = bufferedReader.readLine()).equals("stop")) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {

            }
        }
    }
}
