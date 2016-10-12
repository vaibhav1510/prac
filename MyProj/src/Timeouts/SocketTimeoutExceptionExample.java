/*
 * Copyright (c) 2016 ChargeBee Inc
 * All Rights Reserved.
 */
package Timeouts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vaibhav
 */
public class SocketTimeoutExceptionExample {

    public static void main(String[] args) {
        new Thread(new SimpleServer()).start();
        new Thread(new SimpleClient()).start();
    }

    static class SimpleServer implements Runnable {

        @Override
        public void run() {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(3333);
                serverSocket.setSoTimeout(4000);
                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    System.out.println("sleeping");
//                    Thread.sleep(4000l);
                    System.out.println("awake");
                    BufferedReader inputReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    System.out.println("Client said :" + inputReader.readLine());
                }
            } catch (SocketTimeoutException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
//            } catch (InterruptedException ex) {
//                System.out.println("test");
//                Logger.getLogger(SocketTimeoutExceptionExample.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (serverSocket != null) {
                        serverSocket.close();
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }

    }

    static class SimpleClient implements Runnable {

        @Override
        public void run() {
            Socket socket = null;
            try {
                Thread.sleep(3000);
                socket = new Socket("localhost", 3333);
                socket.setSoTimeout(30);
                PrintWriter outWriter = new PrintWriter(
                        socket.getOutputStream(), true);
                outWriter.println("Hello Mr. Server!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (socket != null) {
                        socket.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
