package com.loong.learnJava;

import redis.clients.jedis.Jedis;

/**
 * @Author: ZhiLong Li
 * @Description: com.loong.learnJava 25.redis_connecter
 * @Date: create in 2020.6.8 16:40
 */
public class JedisUtil {
//    public static void main(String[] args) {
//        Jedis jedis = new Jedis();
//        jedis.set("a", "123");
//        jedis.close();
//    }
    //

    public static void main(String[] args) {
        Jedis jedis = JedisUtil01.getConnection();
        jedis.hset("user", "name", "123");
        jedis.sadd("userSet", "long", "1231231232131", "123");
        jedis.close();
    }
}
