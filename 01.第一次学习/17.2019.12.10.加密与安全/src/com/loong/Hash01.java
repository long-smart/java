package com.loong;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash01 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");

        md.update("hello".getBytes());
        md.update(" word".getBytes());

        byte[] result = md.digest();
        System.out.println(new BigInteger(1, result).toString(16));

    }
}
