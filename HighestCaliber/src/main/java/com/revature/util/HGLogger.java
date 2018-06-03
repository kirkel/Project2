package com.revature.util;

import org.apache.log4j.Logger;

public class HGLogger {

    private static HGLogger instance;
    public final static Logger logger = Logger.getLogger(HGLogger.class);

    // Copy and paste the following line within a class to use logger:
    // public final static Logger logger = HGLogger.getInstance();

    private HGLogger() {
    }

    public static HGLogger getInstance() {
        if (instance == null) {
            instance = new HGLogger();
        }
        return instance;
    }
}
