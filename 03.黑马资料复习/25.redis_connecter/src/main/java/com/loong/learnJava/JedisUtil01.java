package com.loong.learnJava;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnJava 25.redis_connecter
 * @Date: create in 2020.6.8 16:45
 */
public class JedisUtil01 {
    private static JedisPool pool = null;
    static {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        pool = new JedisPool(config, "localhost", 6379);
    }

    public static Jedis getConnection() {
        return pool.getResource();
    }
}
