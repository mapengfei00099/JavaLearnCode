package com.batraining.javabase.course11;

import java.io.*;

/**
 * Created by pengfei on 2017/4/16.
 */
public class FileStreamTest {
    public static void main(String[] args) {
       // readFile();
        FileInputStream fis = null;
        try {
             fis = new FileInputStream(new File("D:\\stream.dat"));
            byte[] bytes = new  byte[6];
            fis.read(bytes);
            String  str = new String(bytes);
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    private static void writeFile() {
        FileOutputStream fos = null;
        try {
             fos = new FileOutputStream(new File("D:\\stream.dat"));
            fos.write("abc".getBytes());
            fos.flush();//将缓冲区里的数据写入文件(清空缓冲区)


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();//最后关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
