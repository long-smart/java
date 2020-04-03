package com.loong;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Hmac01 {
    public static void main(String[] args) throws Exception {
        /*
            和MD5相比，使用HmacMD5的步骤是：
                通过名称HmacMD5获取KeyGenerator实例；
                通过KeyGenerator创建一个SecretKey实例；
                通过名称HmacMD5获取Mac实例；
                用SecretKey初始化Mac实例；
                对Mac实例反复调用update(byte[])输入数据；
                调用Mac实例的doFinal()获取最终的哈希值。
         */
        KeyGenerator keyGen = KeyGenerator.getInstance("HmacMD5");
        SecretKey key = keyGen.generateKey();

        byte[] skey = key.getEncoded();
        System.out.println(new BigInteger(1, skey).toString(16));

        Mac mac = Mac.getInstance("HmacMD5");
        mac.init(key);
        mac.update("HelloWorld".getBytes(StandardCharsets.UTF_8));
        byte[] result = mac.doFinal();
        System.out.println(new BigInteger(1, result).toString(16));
    }
}
