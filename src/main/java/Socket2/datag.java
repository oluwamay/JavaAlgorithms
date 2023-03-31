package Socket2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class datag {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[100000];
        DatagramSocket receiver  = new DatagramSocket(8080);//port of sender
        DatagramSocket sender  = new DatagramSocket();//

        DatagramPacket packet;
        Scanner scanner = new Scanner(System.in);
        while(true){
            //receive data into the byte array
            packet = new DatagramPacket(data, data.length);
            receiver.receive(packet);

            StringBuilder mess = new StringBuilder();
            int i=0;
            while(data[i]!=0){
                mess.append(data[i]);
                i++;
            }
            System.out.println(mess);
            data = new byte[100000];
            //Send data and specify in the packet the local host and port
            String message = scanner.nextLine();

            packet = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getLocalHost(), 8081);
            sender.send(packet);


        }

    }
}
