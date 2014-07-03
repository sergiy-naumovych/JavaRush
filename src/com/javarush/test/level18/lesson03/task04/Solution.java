package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    //Инициализируем штучки
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inp = new FileInputStream(r.readLine());
        String res="";
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> reslist = new ArrayList<Integer>();
//пихаем байты в массив
        while(inp.available()>0)
        {
            int data = inp.read();
            list.add(data);
        }
//в count считаем кол-во каждого байта
        int[] count = new int[list.size()];
        for (int i=0; i<list.size(); i++)
        {
            count[i] = 0;
            for (int j = 0; j < list.size();j++)
            {
                if (list.get(i).equals(list.get(j))) count[i]++;
            }
        }
//определяем минимум
        int min = Integer.MAX_VALUE;
        for (int h: count)
        {
            if (h<min) min = h;
        }
//собираем байты с минимумом использования и без повторов
        for (int i = 0; i<list.size(); i++)
        {
            if (!reslist.contains(list.get(i))&&count[i]==min) reslist.add(list.get(i));
        }
        for (int y: reslist)
        {
            res += y + " ";
        }
        System.out.println(res);
        r.close();
        inp.close();

    }
}