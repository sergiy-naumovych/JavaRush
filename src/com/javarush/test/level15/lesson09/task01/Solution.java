package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        for (int i = 0; i < 5; i++) {
            labels.put((double)i, "ff" + i);
        }
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
