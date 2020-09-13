package com.vanweilin.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Administrator
 * @Project: saas_export
 * @Date: 2020/9/12 17:41
 * @Description:
 */
public class TestString {


    public static void addString(List<String> fisrt, String second) {
        fisrt.add(second);
    }


    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        addString(strings, "two");
        addString(strings, " three");
        addString(strings, " four");
        System.out.println(Arrays.toString(strings.toArray()));
    }
}
