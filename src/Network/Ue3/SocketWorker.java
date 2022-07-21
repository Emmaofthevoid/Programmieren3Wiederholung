package Network.Ue3;

import java.net.ServerSocket;
import java.net.Socket;

public class SocketWorker implements Runnable {

   private Socket socket;

    public SocketWorker(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

    }
}
