package com.batraining.javabase.course12;

import java.io.*;

/**
 * Created by pengfei on 2017/4/23.
 */
public class OutPutStreamWriterTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test001.data");
        OutputStreamWriter outPutStreamWriter = new OutputStreamWriter(fileOutputStream,"GBK");
        outPutStreamWriter.write("fdaskfdsjagl");
        outPutStreamWriter.flush();
        fileOutputStream.flush();
        outPutStreamWriter.close();
        fileOutputStream.close();

    }
}
