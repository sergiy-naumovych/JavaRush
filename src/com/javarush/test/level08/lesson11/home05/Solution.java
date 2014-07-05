package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Пример ввода:
мама     мыла раму.
Пример вывода:
Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] a = s.toCharArray();

        a[0] = Character.toUpperCase(a[0]);

        Boolean b = false;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == ' ')
            {
                b = true;
            }
            else if (a[i] != ' ' && b)
            {
                a[i] = Character.toUpperCase(a[i]);
                b = false;
            }
        }

        System.out.println(a);
    }
}
