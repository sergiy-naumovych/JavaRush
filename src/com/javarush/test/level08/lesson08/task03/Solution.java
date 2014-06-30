package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> names = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            names.put("S"+i, "N"+1);
        }
        return names;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int res = 0;
        for (Map.Entry<String, String> val: map.entrySet()) {
            if (val.getValue().equals(name)) res++;
        }

        return  res;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int res = 0;
        for (Map.Entry<String, String> val: map.entrySet()) {
            if (val.getKey().equals(familiya)) res++;
        }

        return  res;

    }
}
