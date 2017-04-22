package com.batraining.javabase.course11;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by pengfei on 2017/4/16.
 */
public class FileTest {
    public static void main(String[] args) {
        //绝对路径：windows:D:\\   D:/   linux:/home/xxxxx  相对路径：. 当前目录 .. 上一级目录
        //路径分割符： window：\  linux:/  File.separator 表示
        //文件权限：Linux：rwx 可读，可写，可执行
        //临时目录：linux默认:/tmp目录下    File.createTempFile来创建临时文件


        File f = new File("2010416.txt");//默认是当前路径

        try {
            f.createNewFile();//创建一个新文件
           // f.delete();//删除文件
            System.out.println(f.exists());//判断文件是否存在
            System.out.println(f.canRead());
            System.out.println(f.getAbsolutePath());//获取绝对路径
            System.out.println(f.getFreeSpace());//获取磁盘空间的信息
            System.out.println(f.isFile());//判断是否一个文件
            System.out.println(f.isDirectory());//判断是否一个目录
            f.mkdir();//创建文件夹
            File file = new File("D:\\");
            String[] str = file.list();//获取当前目录下的文件/文件夹名称
            System.out.println(Arrays.toString(str));
            File[] files = file.listFiles();//获取当前目录下的文件/文件夹




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
