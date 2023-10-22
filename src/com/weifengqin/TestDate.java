package com.weifengqin;

import java.util.Date;

public class TestDate {
    public void test1() {
        Date d = new Date();
        System.out.println(d);
    }

    public void test2() {
        long time = System.currentTimeMillis();
        System.out.println(time);// 1559806982971
        // 当前系统时间距离 1970-1-1 0:0:0 0 毫秒的时间差，毫秒为单位
    }

    public void test3() {
        Date d = new Date();
        long time = d.getTime();
        System.out.println(time);// 1559807047979
    }

    public void test4() {
        long time = 1559807047979L;
        Date d = new Date(time);
        System.out.println(d);
    }

    public void test5() {
        long time = Long.MAX_VALUE;
        Date d = new Date(time);
        System.out.println(d);
    }

    public static void main(String[] args) {
        TestDate testDate = new TestDate();
        // testDate.test1();// Sun Oct 22 14:31:43 CST 2023
        // testDate.test2();//1697956332938
        // testDate.test3();//1697956342764
        // testDate.test4();
        testDate.test5();
    }
}