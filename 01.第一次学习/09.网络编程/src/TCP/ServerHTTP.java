package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class ServerHTTP {
    private static final String URL = "C:/Users/lzl36/Desktop/";
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(8888);

        Socket server = socket.accept();

        BufferedReader readwb = new BufferedReader(new InputStreamReader(server.getInputStream()));

        String request = readwb.readLine();

        // 通过空格解析出path
        String[] strArr = request.split(" ");
        String path = strArr[1].substring(1);
        System.out.println(path);

        // 读取文件, 返回给浏览器
        FileInputStream fis = new FileInputStream(URL + path);
        byte[] bytes = new byte[1024];
        int len;

        // 输出流, 返回浏览器
        OutputStream out = server.getOutputStream();
        // 写入HTTP协议响应头,固定写法
        out.write("HTTP/1.1 200 OK\r\n".getBytes());
        out.write("Content-Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        out.write("\r\n".getBytes());

        while ((len = fis.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }

        fis.close();
        out.close();
        readwb.close();
        socket.close();
        server.close();
    }
}
