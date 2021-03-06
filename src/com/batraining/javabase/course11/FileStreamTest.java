package com.batraining.javabase.course11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pengfei on 2017/4/16.
 */
public class FileStreamTest {
    public static void main(String[] args) {
       // readFile();
        FileInputStream fis = null;
        try {
            File file = new File("D:\\stream.dat");
            fis = new FileInputStream(file);
           // byte[] bytes = new  byte[6];
            //fis.read(bytes);
            List<Byte> bytes= new ArrayList<Byte>();
            int data = 0;
            while((data=fis.read()) !=-1){
                bytes.add((byte)data);
            }

            //Byte[] bytes1 = bytes.toArray(new Byte[0]);
           //System.out.println(str);
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
