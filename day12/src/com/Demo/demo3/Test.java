package com.Demo.demo3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("10.1.28.194");
        System.out.println(address.getHostAddress());
        System.out.println(address.getHostName());
    }
}
