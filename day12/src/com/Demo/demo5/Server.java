package com.Demo.demo5;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Server {
    private static final Logger LOGGER = LoggerFactory.getLogger(Server.class);
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7080);
        LOGGER.trace("服务端启动成功，等待客户端发起连接");
        Socket accept = serverSocket.accept();
        LOGGER.trace("连接成功，客户端为"+accept.getInetAddress());
        InputStream inputStream = accept.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                inputStream);
        FileOutputStream fileOutputStream = new FileOutputStream("day12\\fiel\\server\\img.png");
        byte[] buffer = new byte[4096];
        int len;
        LOGGER.trace("准备接受文件");
        while((len=bufferedInputStream.read(buffer) )!= -1){
            fileOutputStream.write(buffer,0,len);
        }
        LOGGER.trace("接受完毕");

        OutputStream outputStream = accept.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("上传成功");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        outputStream.close();
        serverSocket.close();

    }
}
