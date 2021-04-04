package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public Server() {
        try {
            Scanner sc = new Scanner(System.in);
            ServerSocket socket = new ServerSocket(8080);
            System.out.println("Server start!");
            Socket servSocket = socket.accept();
            System.out.println("Client connect to server" + servSocket);
            DataOutputStream out = new DataOutputStream(servSocket.getOutputStream());
            DataInputStream in = new DataInputStream(servSocket.getInputStream());

            new Thread(() ->
            {
                while (true) {
                    try {
                        out.writeUTF(sc.nextLine());
                        System.out.println("Message send to client!");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

            while (true) {
                try {
                    System.out.println("Client say: " + in.readUTF());
                } catch (IOException e) {
                    System.out.println("Client disconnect. Server ShutDown...");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
