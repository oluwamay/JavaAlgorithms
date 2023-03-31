package Socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(8989);

        System.out.println("waiting for client to connect..");
        Socket serverReceiver = server.accept();//returns client socket
        System.out.println("Client has connected !");
        BufferedReader serverMessageReceiver = new BufferedReader(new InputStreamReader(serverReceiver.getInputStream()));
        PrintWriter serverSender = new PrintWriter(serverReceiver.getOutputStream(), true);

        String clientMessage = "";
        while(!clientMessage.equals("quit")) {
            clientMessage = serverMessageReceiver.readLine();
            System.out.println(clientMessage);
            BufferedReader sendMessage = new BufferedReader(new InputStreamReader(System.in));
            serverSender.println(sendMessage);
        }

        serverSender.close();
        serverReceiver.close();
        server.close();

    }

}
