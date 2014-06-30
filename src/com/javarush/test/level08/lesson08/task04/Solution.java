package com.javarush.test.level08.lesson08.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{


    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        for (int i = 0; i < 9; i++) map.put("F"+i, new Date("JULY 2 1990"));
        return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        ArrayList<String> names = new ArrayList<String>();
        for (Map.Entry<String, Date> val: map.entrySet()) {
            //System.out.print(val.getValue().getMonth());
            if (val.getValue().getMonth() > 4 && val.getValue().getMonth() < 8) names.add(val.getKey());
        }

        for (String key: names) map.remove(key);

        for (Map.Entry<String, Date> val: map.entrySet()) {
            System.out.println(val.getValue());
        }
    }
}
