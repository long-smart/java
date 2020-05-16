package com.loong.FileUpload;

import jdk.internal.util.xml.impl.Input;

import java.io.*;
import java.net.Socket;

public class Client {
    private static final String url = "C:\\Users\\lzl36\\Desktop\\image\\1588831151(1).jpg";

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 6666);

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(url));
            BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
        ) {
            int len;
            byte[] b = new byte[1024 * 1024 * 8];
            while ((len = bis.read(b)) != -1) {
                out.write(b, 0, len);
            }
            // 告知服务端写出完毕
            socket.shutdownOutput();
            System.out.println("文件发送完毕");

            InputStream in = socket.getInputStream();
            byte[] b1 = new byte[1024];
            int len1 = in.read(b1);
            String msg = new String(b1, 0, len1);
            in.close();
            socket.close();
            System.out.println(msg);
        }
    }
}
