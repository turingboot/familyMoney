package com.tools;


import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    static long msecondsOfday = 1000*60*60*24; //一天的毫秒数

    public static Date today(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR,0); //在窗口控件显示日期的时候不会显示小时，分钟和秒数
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);
        return calendar.getTime();
    }

public static void  main(String[] args){
        System.out.print(DateUtils.today());

}

}

