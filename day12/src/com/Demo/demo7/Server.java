package com.Demo.demo7;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(7080);
        LOGGER.trace("服务端启动成功，等待客户端发起连接");
        while (true) {
            Socket accept = serverSocket.accept();
            LOGGER.trace("连接成功，客户端为" + accept.getInetAddress());
            new Thread(new Task(accept,LOGGER)).start();
        }

    }
}
