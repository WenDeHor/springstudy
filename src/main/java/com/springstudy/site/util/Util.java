package com.springstudy.site.util;

public class Util {
    public static <T extends Comparable<? super T>> boolean isBetweenInclusive(T value, T start, T end) {
        return value.compareTo(start) >= 0 && value.compareTo(end) <= 0;
    }
}