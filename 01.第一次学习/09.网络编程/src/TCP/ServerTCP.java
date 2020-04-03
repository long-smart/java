package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动等待连接");
        // 1.创建serverSocket对象,绑定端口,等待连接
        ServerSocket socket = new ServerSocket(8888);
        // 2.接收连接accept方法, 返回Socket对象
        Socket server = socket.accept();
        // 3.通过Socket获取输入流
        InputStream is = server.getInputStream();
        // 4.一次性读取数据
        byte[] b = new byte[1024];
        int len = is.read(b);

        String msg = new String(b, 0, len);

        System.out.println(msg);
        // 回写数据
        OutputStream out = server.getOutputStream();
        out.write("我是服务端".getBytes());

        // 5.释放资源，断开连接
        out.close();
        is.close();
        server.close();
    }
}
