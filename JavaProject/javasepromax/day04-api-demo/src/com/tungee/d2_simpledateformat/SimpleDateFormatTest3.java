package com.tungee.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest3 {
    public static void main(String[] args) throws ParseException {
        // 1、开始和结束时间
        String startTime = "2021-11-11 00:00:00";
        String endTime = "2021-11-11 00:10:00";

        // 2、zhangsan 和 lisi 参加活动的时间
        String zhangsan = "2021-11-11 00:03:47";
        String lisi = "2021-11-11 00:10:11";

        // 3、解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(zhangsan);
        Date d4 = sdf.parse(lisi);

        if (d3.after(d1) && d3.before(d2)) {
            System.out.println("zhangsan true!");
        }else {
            System.out.println("zhangsan false!");
        }

        if (d4.after(d1) && d4.before(d2)) {
            System.out.println("lisi true!");
        }else {
            System.out.println("lisi false!");
        }

    }
}
