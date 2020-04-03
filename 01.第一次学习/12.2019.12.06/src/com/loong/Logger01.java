package com.loong;

import java.util.logging.Logger;

public class Logger01 {
    public static void main(String[] args) {
        Logger logs = Logger.getGlobal();
        // 信息
        logs.info("log开始");
        // 警告
        logs.warning("log错误");
        logs.fine("log");
        // 严重
        logs.severe("logs severe");
    }
}
