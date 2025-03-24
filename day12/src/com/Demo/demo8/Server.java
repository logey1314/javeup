package com.Demo.demo8;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);
    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        ServerSocket serverSocket = new ServerSocket(7080);
        LOGGER.trace("服务端启动成功，等待客户端发起连接");
        while (true) {
            Socket accept = serverSocket.accept();
            LOGGER.trace("连接成功，客户端为" + accept.getInetAddress());
            /*new Thread(new Task(accept,LOGGER)).start();*/
            executorService.submit(new Task(accept,LOGGER));
        }

    }
}
