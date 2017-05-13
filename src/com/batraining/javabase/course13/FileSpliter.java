package com.batraining.javabase.course13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by pengfei on 2017/5/7.
 */
public class FileSpliter {
    /**
     * 拆分文件
     *
     * @param path 文件的路径
     * @param size 拆分文件的大小（MB）
     */
    public static void split(String path, int size) throws IOException {
        File file = new File(path);
        FileInputStream fis = new FileInputStream(file);
        String targetFiePrefix = path.split("\\.")[0];
        String targetFieSubfix = path.split("\\.")[1];
        long length = file.length();
        //最终拆分的文件的个数
        int fileNum = length % (1024 * 1024 * size) == 0 ? (int) (length / (1024 * 1024 * size)) :
                (int) (length / (1024 * 1024 * size)) + 1;

        for (int i = 1; i <= fileNum; i++) {
            int bufferSize = 0;
            if (i < fileNum) {
                bufferSize = 1024 * 1024 * size;
            } else {

                bufferSize = (int) (length - 1024 * 1024 * size * (i - 1));
            }
            byte[] buffer = new byte[bufferSize];
            fis.read(buffer);
            String targetFileName = targetFiePrefix + "_" + i + "." + targetFieSubfix;
            FileOutputStream fos = new FileOutputStream(new File(targetFileName));
            fos.write(buffer);
            fos.flush();
            fos.close();
        }


        fis.close();


    }

    public static void main(String[] args) {
        try {
            split("Java第一课 .pptx", 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
