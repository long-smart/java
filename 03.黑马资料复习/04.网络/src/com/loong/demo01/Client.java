package com.loong.demo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6666);

        OutputStream out = socket.getOutputStream();
        out.write("我来了，你好吗".getBytes());

        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);

        String msg = new String(b, 0, len);
        System.out.println(msg);

        in.close();
        out.close();
        socket.close();
    }
}
