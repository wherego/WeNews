package com.darklh.wenews.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by darklh on 2016/11/23.
 */

public class DateUtil {

    public static String getDate(long timeMis) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timeMis);
        return sdf.format(date);
    }

}
