package com.loong;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Safety01 {
    public static void main(String[] args) {
        String encoder = URLEncoder.encode("中文!", StandardCharsets.UTF_8);
        System.out.println(URLDecoder.decode(encoder, StandardCharsets.UTF_8));

        byte[] input = new byte[] { (byte) 0xe4, (byte) 0xb8, (byte) 0xad };
        String b64encoded = Base64.getEncoder().encodeToString(input);
        System.out.println(b64encoded);
    }
}
