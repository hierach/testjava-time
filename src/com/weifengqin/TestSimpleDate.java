package com.weifengqin;


import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDate {
    @Test
    public  void test1() {
        Date d = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SSS 毫秒 E Z");
        // 把 Date 日期转成字符串，按照指定的格式转
        String str = sf.format(d);
        System.out.println(str);
    }

    @Test
    public void test2() throws ParseException {
        String str = "2022 年 06 月 06 日 16 时 03 分 14 秒 545 毫秒 星期四 +0800";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SSS 毫秒 E Z");
        Date d = sf.parse(str);
        System.out.println(d);
    }

}
