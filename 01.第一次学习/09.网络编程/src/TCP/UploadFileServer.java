package TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadFileServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动");

        ServerSocket socket = new ServerSocket(8888);

        while (true) {
            // 接收一个连接的Socket
            Socket accept = socket.accept();
            // 创建线程，重写run方法, 然后start
            new Thread(() -> {
                // 获取输入输出流
                try (BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                     FileOutputStream fis = new FileOutputStream(System.currentTimeMillis() + ".png");
                     BufferedOutputStream bos = new BufferedOutputStream(fis)) {

                    byte[] b = new byte[1024];
                    int len;
                    while ((len = bis.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }
                    // 信息回写
                    OutputStream out = accept.getOutputStream();
                    out.write("上传成功".getBytes());
                    // 关闭资源
                    out.close();
                    bos.close();
                    bis.close();
                    accept.close();

                    System.out.println("文件已上传");
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }).start();

        }
    }
}
