package com.batraining.javabase.course12;

import java.io.*;

/**
 *实现文件复制的功能
 */
public class FileCopyExample {
    public static void main(String[] args) {
        try {
            fileCopy("D:\\1.pdf","E:\\1.pdf");
        } catch (IOException e) {
            System.out.println("拷贝异常"+e.getMessage());
        }
    }


    public static void fileCopy(String sourceFile,String targetFile) throws IOException {
        FileInputStream fis = new FileInputStream(new File(sourceFile));
        FileOutputStream fos = new FileOutputStream(new File(targetFile));
        byte[] buffer = new byte[512];
        int length =0;
        while ((length=fis.read(buffer))!=-1){
            fos.write(buffer);
        }
        fos.flush();
        fis.close();
        fos.close();

    }
}
