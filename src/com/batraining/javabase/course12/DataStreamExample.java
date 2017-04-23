package com.batraining.javabase.course12;

import java.io.*;

/**
 * Created by pengfei on 2017/4/23.
 */
public class DataStreamExample {
    public static void main(String[] args) throws IOException {
        dataOutputStream();
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int num = dataInputStream.readInt();
        boolean result = dataInputStream.readBoolean();
        dataInputStream.readDouble();
        dataInputStream.readFloat();
        dataInputStream.close();
        fileInputStream.close();


    }

    private static void dataOutputStream() throws IOException {
        //DataOutputStream 是FilterOutputStream 的子类，它对outputStream 进行了封装
        //设计模式：装饰器模式
        //使之能够写基本数据类型数据
        FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(12);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeDouble(324);
        dataOutputStream.writeFloat(432432);
        dataOutputStream.writeChars("flkadjfkldasj");
        dataOutputStream.flush();
        fileOutputStream.flush();
        dataOutputStream.close();
        fileOutputStream.close();
    }
}
