package com.cs.util;

import com.google.common.base.Preconditions;

/**
 * 哈希工具类，提供将long型的id转换为62进制的短网址字符串的功能
 *
 * @author: baitan
 * @date: 2022/4/7 20:50
 */
public class HashUtil {
    private static final char[] CHARS;

    /**
     * 合法的id上届
     */
    private static final long BOUND = 56800235584L;

    public static final int LONG = 62;

    static {
        // 随机串
        CHARS = "uS65iZ2KaHoRbexDB4P0UzrAJ1cmdFynNWtCqfwskTl7gMv8jIXVELOp3YG9Qh".toCharArray();
    }

    public static String toDwzString(long id) {
        Preconditions.checkArgument(id > 0 && id < BOUND,
                "id must be less than 62 to the 6th power and more than 0");

        char[] dwz = new char[6];
        int index = 5;
        while (id != 0) {
            dwz[index--] = CHARS[Math.toIntExact(id % LONG)];
            id = id / LONG;
        }
        // 填充为第一个字符
        for (int i = index; i >= 0; i--) {
            dwz[i] = CHARS[0];
        }
        return String.valueOf(dwz);
    }

}
