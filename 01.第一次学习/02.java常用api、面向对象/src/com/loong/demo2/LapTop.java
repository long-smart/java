package com.loong.demo2;

public class LapTop {
    public void run () {
        System.out.println("笔记本运行");
    }

    public void useUSB(USB usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse) {
                Mouse m = (Mouse) usb;
                m.click();
            } else if (usb instanceof keyBoard) {
                keyBoard b = (keyBoard) usb;
                b.type();
            }

            usb.close();
        }
    }

    public void shutdown() {
        System.out.println("笔记本关闭");
    }
}
