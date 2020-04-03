package com.loong.innerClass;

public class innerClass {
    private boolean live = true;

    class Heart {
        public void jump() {
            if (live) {
                System.out.println("心脏在跳动");
            } else {
                System.out.println("死了");
            }
        }
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }
}
