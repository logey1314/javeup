package com.Demo.demo4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
    private static final Logger log = LoggerFactory.getLogger("Server");
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7080);
        log.trace("server start");
        Socket accept = serverSocket.accept();
        log.trace("Accepted connection"+accept.getInetAddress());

        InputStream inputStream = accept.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        len=inputStream.read(buffer);
            System.out.println(new String(buffer,0,len));


        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("Hello World".getBytes());

        accept.close();
    }
}
