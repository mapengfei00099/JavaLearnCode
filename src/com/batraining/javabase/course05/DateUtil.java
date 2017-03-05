package com.batraining.javabase.course05;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**日期时间工具类
 * Created by pengfei on 2017/1/10.
 */
public class DateUtil {
    private  static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Date getNowDate(){
           return  new Date();
    }

    public static String getNowDateString(){
        return dateFormat.format(getNowDate());
    }

    public static void main(String[] args) {
        System.out.println(DateUtil.getNowDate());
        System.out.println(DateUtil.getNowDateString());
    }


}
