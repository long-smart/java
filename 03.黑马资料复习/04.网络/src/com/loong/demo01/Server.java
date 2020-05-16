package com.loong.demo01;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(6666);
        Socket socket = server.accept();

        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);
        String msg = new String(b, 0, len);
        System.out.println("接收到的是" + msg);

        OutputStream out = socket.getOutputStream();
        out.write("我很好".getBytes());
        out.close();
        in.close();
        server.close();
    }
}
