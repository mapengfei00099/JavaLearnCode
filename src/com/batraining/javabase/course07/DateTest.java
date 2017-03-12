package com.batraining.javabase.course07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by pengfei on 2017/3/12.
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //时间戳：
        // Java：从1970年1月1日到当前时间的毫秒数，
        // Linux：从1970年1月1日的秒数
        System.out.println(date.getTime());
        //时间的运算通常都是使用Calendar类
       // date.getYear() 推荐用Calendar类
        Calendar calendar =Calendar.getInstance();//获取当前时间的Calendar
        // 获取当前的年份
        int year= calendar.get(Calendar.YEAR);
        System.out.println(year);
        //注意：Calendar中月份是0开始的，既0 代表1月
        int month = calendar.get(Calendar.MONTH);
        System.out.println(month);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        //注意这些常量值得含义
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);

        //Calendar.HOUR 这个是12小时制，Calendar.HOUR_OF_DAY 这个是24小时制
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        int minute = calendar.get(Calendar.MINUTE);
        System.out.println(minute);
        int second = calendar.get(Calendar.SECOND);
        System.out.println(second);

        //Calendar 里包含 时间运算的方法，例如add，set方法
        calendar.add(Calendar.HOUR,1);//当前时间增加1小时，
        //Date 和Calender 的相互转化
        //Date 转为Calendar
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        //Calendar 转为Date
        Date date2 =  calendar1.getTime();

        //Calender 的子类，标准的日历系统
        GregorianCalendar calendar2= new GregorianCalendar(2017,12,1);


    }
}
