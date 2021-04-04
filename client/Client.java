package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public Client() {
        try {
            Socket clientSocket = new Socket("127.0.0.1", 8080);
            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            Scanner sc = new Scanner(System.in);


            new Thread(() -> {
                while (true) {
                    try {
                        out.writeUTF(sc.nextLine());
                        System.out.println("Message send to server!");
                    } catch (IOException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }).start();

            while (true) {
                try {
                    System.out.println("Server say: " + in.readUTF());

                } catch (IOException e) {
                    System.out.println("Server is down");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
