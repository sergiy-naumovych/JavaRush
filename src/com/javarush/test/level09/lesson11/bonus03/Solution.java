package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        for (String x : array) {
            if (isNumber(x)) {
                numbers.add(Integer.parseInt(x));
            } else
            {
                strings.add(x);
            }
        }
        Collections.sort(numbers);
        Collections.reverse(numbers);
        Collections.sort(strings);

        int indexOfNumbers = 0;
        int indexOfStrings = 0;
        for (String x : array) {
            if (isNumber(x)) {
                result.add(numbers.get(indexOfNumbers).toString());
                indexOfNumbers++;
            } else {
                result.add(strings.get(indexOfStrings));
                indexOfStrings++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = result.get(i);
        }
    }

    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        for (char c : s.toCharArray())
        {
            if (!Character.isDigit(c) && c != '-') return false;
        }
        return true;
    }
}