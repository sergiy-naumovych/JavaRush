package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    private static  ArrayList list;

    public static void main(String[] args) throws Exception {
//read strings and init ArrayList list here — считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList list = new ArrayList();

        for (int i=0;i<=9; i++) {
            list.add(reader.readLine());
        }

        ArrayList result = doubleValues(list);

        for (int i=0; i<=result.size()-1;i++) {
            System.out.println(result.get(i));
        }
//print result — вывести на экран result
    }

    public static ArrayList doubleValues(ArrayList list) {
        ArrayList list1 = new ArrayList();
        int t = list.size();


        for (int i=0;i < t;i++) {
            list1.add(list.get(i));
            list1.add(list.get(i));
        }

// add your code here — добавь код тут
        return list1;
    }
}