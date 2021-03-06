package com.batraining.javabase.course11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by pengfei on 2017/4/16.
 */
public class ReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
             fr = new FileReader(new File("data.txt"));
            int c = 0;
            List<Character> charList= new ArrayList<Character>();
           while ((c= fr.read())!=-1){
               char temp  = (char)c;
               charList.add(temp);
           }
            char[] charArr = new char[charList.size()];
            int index=0;
            for (Character temp : charList) {
                charArr[index] =temp;
                index++;
            }
           String str= new String(charArr);
            String[] strArr = str.split("\r\n");
            Map<String,String> userNamePasswordMap = new HashMap<String,String>();
            for (String temp : strArr) {
                String[] strArrTemp =temp.split(",");
                String userName = strArrTemp[0];
                String password = strArrTemp[1];
                userNamePasswordMap.put(userName,password);

            }
            Scanner scanner = new Scanner(System.in);
            System.out.print("请输入用户名：");
            String userName = scanner.next();
            System.out.print("请输入密码：");
            String password = scanner.next();
            String realPassword = userNamePasswordMap.get(userName);
            if(realPassword ==null){
                System.out.println("你输入的用户不存在");
            }else{
                if(!realPassword.equals(password)){
                    System.out.println("密码不正确");
                }else{
                    System.out.println("登录成功");
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
