package TCP;

import java.io.*;
import java.net.Socket;

public class UploadFileClient {
    private static final String URL = "C:/Users/lzl36/Desktop/redux流程.png";

    public static void main(String[] args) throws IOException {
        // 创建输入流，从本地读取文件
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(URL));
        // 创建输出流， 写到服务器
        Socket socket = new Socket("localhost", 8888);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        // 写出数据
        byte[] b = new byte[1024];
        int len;

        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        // 关闭输出流，通知服务端,写出数据完毕
        socket.shutdownOutput();

        // 解析回写数据
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[24];
        in.read(bytes);
        System.out.println(new String(bytes));
        in.close();

        socket.close();
        bis.close();
    }
}
