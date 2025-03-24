package com.Demo.demo7;

import java.io.*;
import java.net.Socket;
import java.util.UUID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task implements Runnable {
    private Socket accept;
    private Logger LOGGER;


    public Task() {
    }

    public Task(Socket accept, Logger LOGGER) {
        this.accept = accept;
        this.LOGGER = LOGGER;
    }

    @Override
    public void run() {
        InputStream inputStream=null;
        BufferedInputStream bufferedInputStream=null;
        FileOutputStream fileOutputStream=null;
        OutputStream outputStream=null;
        BufferedWriter bufferedWriter=null;

        try {
            inputStream = accept.getInputStream();
             bufferedInputStream = new BufferedInputStream(
                    inputStream);
            String randName= UUID.randomUUID().toString();
            fileOutputStream = new FileOutputStream("day12\\fiel\\server\\"+randName+".png");
            byte[] buffer = new byte[4096];
            int len;
            LOGGER.trace("准备接受文件");
            while ((len = bufferedInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, len);
            }
            LOGGER.trace("接受完毕");

            outputStream = accept.getOutputStream();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
            bufferedWriter.write("上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();



        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                accept.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
