package TCP;

import java.io.*;
import java.net.Socket;

public class Web implements Runnable {
    private Socket socket;
    private static final String URL = "C:/Users/lzl36/Desktop/";

    public Web(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader readwr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request = readwr.readLine();
            String[] strArr = request.split(" ");
            String path = strArr[1].substring(1);

            FileInputStream fis = new FileInputStream(URL + path);
            int len;
            byte[] bytes = new byte[1024];

            OutputStream out = socket.getOutputStream();

            out.write("HTTP/1.1 200 OK\r\n".getBytes());
            out.write("Content-Type:text/html\r\n".getBytes());
            out.write("\r\n".getBytes());
            while ((len = fis.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }

            fis.close();
            out.close();
            readwr.close();
            socket.close();

        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
