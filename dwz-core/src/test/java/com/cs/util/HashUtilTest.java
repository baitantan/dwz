package com.cs.util;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: baitan
 * @date: 2022/4/7 21:08
 */
@Slf4j
public class HashUtilTest {
    @Test(expected = IllegalArgumentException.class)
    public void test1() {
        HashUtil.toDwzString(Long.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test2() {
        HashUtil.toDwzString(-1);
    }

    @Test
    public void test3() {
        String dwzString = HashUtil.toDwzString(1);
        Assert.assertEquals(dwzString, "uuuuuS");
    }

    @Test
    public void test4() {
        String dwzString = HashUtil.toDwzString(16);
        Assert.assertEquals(dwzString, "uuuuuB");
    }

    @Test
    public void test5() {
        String dwzString = HashUtil.toDwzString((long) Math.pow(62, 6) - 1);
        Assert.assertEquals(dwzString, "hhhhhh");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test6() {
        HashUtil.toDwzString((long) Math.pow(62, 6));
    }
}
