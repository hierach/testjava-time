package com.weifengqin;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author qin start
 * @create 2023-10-22-14:58
 */
public class TestLocalTime {
    /**
     * 获取当前时间的实例
     */
    @Test
    public void test01(){
        LocalDate now = LocalDate.now();
        System.out.println(now);//2023-10-22
    }
    @Test
    public void test02(){
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }
    @Test
    public void test03(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2023-10-22T15:00:18.442
    }

    /**
     * 获取指定时间的实例
     */
    @Test
    public void test04(){
        LocalDate lai = LocalDate.of(2019, 5, 13);
        System.out.println(lai);
    }

    /**
     * 获得一年的第几天
     */
    @Test
    public void test05(){
        LocalDate lai = LocalDate.of(2019, 5, 13);
        System.out.println(lai.getDayOfYear());
    }

    /**
     * 加时间 不可变
     */
    @Test
    public void test06(){
        LocalDate lai = LocalDate.of(2019, 5, 13);
        LocalDate go = lai.plusDays(160);
        System.out.println(go);//2019-10-20
    }

    @Test
    public void test7(){
        LocalDate now = LocalDate.now();
        LocalDate before = now.minusDays(100);
        System.out.println(before);//2019-02-26
    }
}
