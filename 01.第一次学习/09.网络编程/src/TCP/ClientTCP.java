package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端发送数据");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket socket = new Socket("localhost", 8888);
        // 2.获取流对象 . 输出流
        OutputStream os = socket.getOutputStream();
        // 3.写出数据.
        os.write("你好， 我是客户端。".getBytes());
        // 4.接收服务端响应
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);
        System.out.println(new String(b, 0, len));

        // 4.关闭资源
        os.close();
        socket.close();
    }
}
