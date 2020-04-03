package com.loong.redPacket;

import javax.swing.*;

public class RedPacketFrame extends JFrame {
    public String ownerName = "小李";

    public OpenMode openMode = null;

    public RedPacketFrame(String title) {
        super(title);
        frameInit();
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setOpenMode(OpenMode openMode) {
        this.openMode = openMode;
    }
}
