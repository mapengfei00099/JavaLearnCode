package com.batraining.javabase.course12;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 带缓冲区的Stream读取
 */
public class FileStreamTest {
    public static void main(String[] args) {
        // readFile();
        FileInputStream fis = null;
        try {
            File file = new File("D:\\stream.dat");
            fis = new FileInputStream(file);

            int length = 0;
            byte[] buffer= new byte[512];//带缓冲区读取流
            StringBuffer sb = new StringBuffer();
            //1MB=1024*1024
            //length read方法读取实际的数据的长度
            while ((length = fis.read(buffer)) != -1) {
                System.out.println(length);
                sb.append(new String(buffer));//转为String，需要先明确是否为文本文件
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
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
        } finally {
            if (fos != null) {
                try {
                    fos.close();//最后关闭输出流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
