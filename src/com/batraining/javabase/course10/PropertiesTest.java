package com.batraining.javabase.course10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by pengfei on 2017/4/9.
 */
public class PropertiesTest {

    public static void main(String[] args) {
        //Properties 是Hash Map的子类，通常用来读取key=value 的配置properties文件
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("info.properties"));
            System.out.println(properties.getProperty("hello"));
            System.out.println(System.getProperties());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
