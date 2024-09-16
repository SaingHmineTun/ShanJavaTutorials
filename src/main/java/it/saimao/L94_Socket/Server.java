package it.saimao.L94_Socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
1) Port number
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Listening on port 5000...");
            Socket socket = serverSocket.accept();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("Hello Client. I am server");
            writer.newLine();
            writer.write("THE END");
            writer.close();
        } catch (IOException e) {
            System.out.println("Cannot create server socket");
        }

    }
}
