package com.loong.learnJava;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnJava 01.RabbitMQ
 * @Date: create in 2020.8.13 10:26
 */
public class Producer {
    public static final String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/test");
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");

        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, true, false, false, null);

        String msg = "你好a, 我又发送了";

        channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
        System.out.println("已发送消息" + msg);

        channel.close();
        connectionFactory.clone();
    }
}
