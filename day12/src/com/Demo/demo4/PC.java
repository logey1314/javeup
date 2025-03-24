package com.Demo.demo4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class PC {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",7080);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello World".getBytes());


        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[1024];
        int len;
        len=inputStream.read(buffer) ;
        System.out.println(new String(buffer,0,len));



        outputStream.close();
        socket.close();
    }
}
