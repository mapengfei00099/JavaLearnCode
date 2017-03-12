package com.batraining.javabase.course07;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pengfei on 2017/3/12.
 */
public class DateFormatTest {
    public static void main(String[] args) {
        //字符串日期转化通常使用DateFormat及其子类SimpleDateFormat，注意，构造的pattern参数，
        //y年，yyyy 代表4位年，例如：2017，yy代表2位年，例如17
        //MM 月份
        //dd 日
        //HH 小时，24小时，hh 12小时
        //mm 分钟
        //ss 秒
        //其他字段可以见SimpleDateFormat的api文档
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //日期转为字符串
        String dateStr = df.format(new Date());
        System.out.println(dateStr);
        try {
            //字符串转为日期（字符串的格式要与上面的pattern表达式一致）
            Date date1 = df.parse("2014-12-01 22:12:12");
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
