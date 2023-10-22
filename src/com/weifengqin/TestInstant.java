package com.weifengqin;

import org.junit.Test;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author qin start
 * @create 2023-10-22-15:05
 */
public class TestInstant {

    /**
     * Instant时间戳是按格林尼治的时间来的
     */
    @Test
    public void test1(){
        //获取毫秒数对象
        Instant instant = Instant.now();
        System.out.println(instant);//2023-10-22T07:06:21.972Z  相差八个小时

        //制定时区
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//正确的时间

        //指定毫秒数
        Instant epochMilli = Instant.ofEpochMilli(546546465464L);
        System.out.println(epochMilli);

        //解析毫秒数
        long toEpochMilli = epochMilli.toEpochMilli();
        System.out.println(toEpochMilli);
    }
}
