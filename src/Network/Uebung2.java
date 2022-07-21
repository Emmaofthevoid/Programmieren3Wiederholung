package Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Uebung2 {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            System.out.println("Server hat gestartet");
            ServerSocket serverSocket = new ServerSocket(9090);
            Socket socket = serverSocket.accept();
            System.out.println("Client hat sich verbunden");

            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            bufferedWriter.write("Hi, I am a buffered writer and as Server I say hi.");
            bufferedWriter.newLine();
            bufferedWriter.flush();


            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                if (line.equals("PORT")) {
                    bufferedWriter.write("PORT: " + socket.getPort());
                    bufferedWriter.newLine();
                } else if (line.equals("TIME")) {
                    Date date = new Date();
                    bufferedWriter.write("TIME: " + date);
                    bufferedWriter.newLine();
                } else if (line.equals("END")) {
                    bufferedWriter.write("ENDE");
                    bufferedWriter.write("Server will close now.");
                    bufferedWriter.flush();
                    break;
                } else {
                    bufferedWriter.write("FALSCHES KOMMANDO");
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
