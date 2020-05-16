package com.loong.FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(6666);

        while (true) {
            Socket socket = server.accept();
            new Thread(() -> {
                try (
                    BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
                    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis() + ".jpg"));
                ) {
                    byte[] b = new byte[1024 * 1024 * 4];
                    int len;
                    while ((len = in.read(b)) != -1) {
                        out.write(b, 0, len);
                    }

                    // 信息回写， 告诉客户端保存成功
                    System.out.println("back");
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("上传成功".getBytes());
                    outputStream.close();

                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }



    }
}
