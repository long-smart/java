package com.loong;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Logger02 {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(Logger02.class);
        log.info("start...");
        log.warn("end.");
    }
}
