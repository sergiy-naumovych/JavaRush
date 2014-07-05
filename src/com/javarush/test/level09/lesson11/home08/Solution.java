package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);

    }

    public static ArrayList<int[]> createList()
    {

        ArrayList<int[]>list = new ArrayList<int[]>();

        int[] s = new int[5];
        s[0] = 12;
        s[1] = 12;
        s[2] = 12;
        s[3] = 12;
        s[4] = 12;
        list.add(s);
        int[] b = new int[2];
        b[0] = 19;
        b[1] = 20;
        list.add(b);
        int[] v = new int[4];
        v[0] = 4;
        v[1] = 4;
        v[2] = 4;
        v[3] = 4;
        list.add(v);
        int[] g = new int[7];
        g[0] = 234;
        g[1] = 234;
        g[2] = 234;
        g[3] = 234;
        g[4] = 234;
        g[5] = 234;
        g[6] = 234;
        list.add(g);
        int[] a = new int[0];
        list.add(a);


        return list;
        //Написать тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
