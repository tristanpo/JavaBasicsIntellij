package com.syntax.Class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemoHW {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\badoo\\OneDrive\\Desktop\\Batch12\\facebook.properties";
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.put("browser","chrome");
        properties.put("URL","https//facebook.com");
        properties.put("username","tristan");
        properties.put("password","pass123");
        properties.store(fileOutputStream,"login info");
        System.out.println(properties.get("browser"));
        System.out.println(properties.get("URL"));


    }
}
