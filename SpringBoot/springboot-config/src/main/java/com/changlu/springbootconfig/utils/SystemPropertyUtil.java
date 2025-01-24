package com.changlu.springbootconfig.utils;

import java.io.File;

public class SystemPropertyUtil {

    public static void setSystemUserDir() {
        String dir = System.getProperty("user.dir");
        String conf = String.format("%s/%s", dir, "conf");
        File file = new File(conf);
        if(!file.exists()) {
            dir = dir.substring(0, dir.lastIndexOf("/"));
            conf = String.format("%s/%s", dir, "conf");
            file = new File(conf);
            if(file.exists()) {
                System.setProperty("user.dir", dir);
            }
        }
        System.setProperty("user.dir.conf", System.getProperty("user.dir") + "/conf");
    }
}