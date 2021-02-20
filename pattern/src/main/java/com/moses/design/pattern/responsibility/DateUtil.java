/*
 * Copyright © 2021 287664409@qq.com Inc. All rights reserved
 * @description: com.moses.design.pattern.responsibility.DateUtil
 * @version V1.0
 */
package com.moses.design.pattern.responsibility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Moses
 * @date 2021/2/5
 */
public class DateUtil {
    protected static SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 时间格式化

    public static Date getFirstDay() {
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        return cale.getTime();
    }

    public static Date getLastDay() {
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        return cale.getTime();
    }

    public static void main(String[] args) {
        System.out.println(f.format(getLastDay()));
    }

    public static String getDate() {
        return f.format(new Date());
    }
}
