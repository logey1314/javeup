package com.home.work1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger log = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        // 确保日志目录存在
        java.io.File logDir = new java.io.File("F:/logs");
        if (!logDir.exists()) {
            logDir.mkdirs();
        }

        log.info("123");
        System.out.println("Hello World");
        log.debug("456");
        Show();
        log.trace("789");
    }

    public static void Show() {
        System.out.println("Hello show");
    }
}
