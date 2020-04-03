package com.loong;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        ds.setSoTimeout(1000);
        ds.connect(InetAddress.getByName("localhost"), 6666);

        byte[] data = "客户端发送".getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length);

        ds.send(packet);

        byte[] buffer = new byte[1024];
        packet = new DatagramPacket(buffer, buffer.length);
        ds.receive(packet);
        String res = new String(packet.getData(), packet.getOffset(), packet.getLength(), StandardCharsets.UTF_8);
        ds.disconnect();
        System.out.println(res);
    }
}
