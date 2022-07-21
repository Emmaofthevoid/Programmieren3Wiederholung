package Network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Uebung1 {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        FileWriter fileWriter;

        try {
            System.out.println("Bitte url eingeben. JETZT.");
            Scanner scanner = new Scanner(System.in);
            String url = scanner.nextLine();
            //"https://github.com/Emmaofthevoid/Programmieren3Wiederholung"

            URL myURL = new URL(url);
            InputStreamReader inputStreamReader = new InputStreamReader(myURL.openStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            fileWriter = new FileWriter("stupidurls.html");
            bufferedWriter = new BufferedWriter(fileWriter);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                System.out.println(line);
            }
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (bufferedReader != null) {

                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
