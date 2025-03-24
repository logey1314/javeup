package com.Demo.demo6;

import java.io.*;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PC {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.Demo.demo5.PC.class);
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 7080);
        LOGGER.trace("向"+socket.getInetAddress()+"服务端发起连接");
        OutputStream outputStream = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                outputStream);
        FileInputStream fileInputStream = new FileInputStream("day12\\fiel\\pc\\img.png");
        byte[] bytes = new byte[4096];
        int len;
        LOGGER.trace("准备发送文件");
        while ((len=fileInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);
        }
        bufferedOutputStream.flush();
        LOGGER.trace("发送完毕");
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String msg=bufferedReader.readLine();
        LOGGER.trace(msg);

        inputStream.close();
        bufferedReader.close();
        outputStream.close();
        socket.close();


    }
}
