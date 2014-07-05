package com.javarush.test.level10.lesson11.home08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести на их экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] arrayOfStringList = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("2");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("3");

        arrayOfStringList[0]= list1;
        arrayOfStringList[1] = list2;
        arrayOfStringList[2] = list3;
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}