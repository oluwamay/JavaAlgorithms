package Socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 8989);
        
        BufferedReader clientReceiver = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter clientSender = new PrintWriter(client.getOutputStream(), true);
        Scanner scanner = new Scanner(System.in);
        while(client.isConnected()) {
            clientSender.println(scanner.nextLine());
            String serverResponse = clientReceiver.readLine();
            System.out.println(serverResponse);
        }
        client.close();
        clientReceiver.close();
        clientSender.close();

    }
}
