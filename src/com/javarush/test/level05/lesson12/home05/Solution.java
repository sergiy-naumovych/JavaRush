package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        total += getNumber(reader);

        System.out.println(total);
    }

    private static int getNumber(BufferedReader reader) throws IOException
    {
        String val = reader.readLine();
        if (val.equals("сумма"))
        {
            return 0;
        }

        return Integer.parseInt(val) + getNumber(reader);
    }
}
