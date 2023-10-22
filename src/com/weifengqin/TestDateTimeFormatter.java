package com.weifengqin;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author qin start
 * @create 2023-10-22-15:14
 */
public class TestDateTimeFormatter {

    @Test
    public void test(){
        //方式三：自定义的方式（关注、重点）
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //格式化
        String strDateTime = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(strDateTime); //2023/10/22 15:15:26
        //解析
        TemporalAccessor accessor = dateTimeFormatter.parse("2023/10/22 15:15:26");
        LocalDateTime localDateTime = LocalDateTime.from(accessor);
        System.out.println(localDateTime); //2023-10-22T15:15:26
    }
}
