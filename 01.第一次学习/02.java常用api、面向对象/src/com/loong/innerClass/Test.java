package com.loong.innerClass;

public class Test {
    public static void main(String[] args) {
        innerClass in = new innerClass();

        innerClass.Heart heart = in.new Heart();

        heart.jump();

        in.setLive(false);

        heart.jump();
    }
}
