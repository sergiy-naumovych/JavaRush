package com.javarush.test.level08.lesson08.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public  static void main(String[] args){
        HashSet<Integer> set = createSet();
        removeAllNumbersMoreThen10(set);
    }

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> res = new HashSet<Integer>();
        for (int i = 0; i < 20; i++) res.add(i);
        return res;
        //Напишите тут ваш код

    }

    public static HashSet<Integer> removeAllNumbersMoreThen10(HashSet<Integer> set)
    {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (Integer val: set) {
            System.out.println(val);
            if (val > 10) temp.add(val);
        }
        set.removeAll(temp);
        System.out.println();

        for (Integer val: set) {
            System.out.println(val);
        }

        return set;
        //Напишите тут ваш код

    }
}
