package com.loong.learnJava;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnJava 01.RabbitMQ
 * @Date: create in 2020.8.13 10:33
 */
public class ConnectionUtil {
    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        connectionFactory.setHost("localhost");
        connectionFactory.setPort(5672);
        connectionFactory.setVirtualHost("/test");
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("admin");

        return connectionFactory.newConnection();
    }
}
